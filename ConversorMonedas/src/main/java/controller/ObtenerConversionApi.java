package controller;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.DatosIngresados;
import entity.Monedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerConversionApi {
    public Monedas obtenermoneda(DatosIngresados datosIngresados) throws IOException, InterruptedException {
        String url="https://v6.exchangerate-api.com/v6/41002c81e8b0229662c2310d/pair/"
                +datosIngresados.getNombredivisabase()
                +"/"
                +datosIngresados.getNombredivisaconversion()
                +"/"
                +datosIngresados.getDivisaIngresada();
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response=client
                .send(request,HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        //System.out.println(response.body());
        String json=response.body();
        Monedas moneda= gson.fromJson(json, Monedas.class);
        return moneda;
    }
}

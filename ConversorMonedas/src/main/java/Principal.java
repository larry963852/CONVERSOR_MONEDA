import controller.ObtenerConversionApi;
import entity.DatosIngresados;
import entity.Monedas;

import java.io.IOException;
import java.util.Scanner;

//@Chamorro Alva Melvin
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Sistema de Conversor de monedas
        ObtenerConversionApi conversionApi=new ObtenerConversionApi();
        String menus= """
                ****************************************************************
                Sea bienvenid@ al Conversor de Monedas  =]
                
                1) Dólar            =>> Peso Argentino
                2) Peso Argentino   =>> Dólar
                3) Dólar            =>> Real Brazileño
                4) Real Brazileño   =>> Dólar
                5) Dólar            =>> Peso Colombiano
                6) Peso Colombiano  =>> Dólar
                7) Dólar            =>> Peso Méxicano
                8) Peso Méxicano    =>> Dólar
                9) SALIR
                Seleccione una opcion valida:
                ****************************************************************
                """;
        String opcion ="";
        Scanner teclado= new Scanner(System.in);
        Scanner escanerCantidad= new Scanner(System.in);
        String nombredivisabase="";
        String nombredivisaconversion="";
        double divisaIngresada=0;
        double cantidad=0;
        Monedas moneda= new Monedas();
        DatosIngresados datosIngresados= new DatosIngresados();
        while (!teclado.equals("SALIR")){
            System.out.println(menus);
            var busqueda=teclado.nextLine();
            if(busqueda.equalsIgnoreCase("salir")){
                break;
            }
            switch(busqueda){
                case "1"://1) Dólar            =>> Peso Argentino
                    nombredivisabase="USD";
                    nombredivisaconversion="ARS";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [USD] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [ARS]");
                    break;
                case "2"://2) Peso Argentino   =>> Dólar
                    nombredivisabase="ARS";
                    nombredivisaconversion="USD";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [ARS] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [USD]");
                    break;
                case "3"://3) Dólar            =>> Real Brazileño
                    nombredivisabase="USD";
                    nombredivisaconversion="BRL";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [USD] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [BRL]");
                    break;
                case "4"://4) Real Brazileño   =>> Dólar
                    nombredivisabase="BRL";
                    nombredivisaconversion="USD";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [BRL] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [USD]");
                    break;
                case "5"://5) Dólar            =>> Peso Colombiano
                    nombredivisabase="USD";
                    nombredivisaconversion="COP";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [USD] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [COP]");
                    break;
                case "6"://6) Peso Colombiano  =>> Dólar
                    nombredivisabase="COP";
                    nombredivisaconversion="USD";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [COP] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [USD]");
                    break;
                case "7"://7) Dólar            =>> Peso Méxicano
                    nombredivisabase="USD";
                    nombredivisaconversion="MXN";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [USD] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [MXN]");
                    break;
                case "8"://8) Peso Méxicano    =>> Dólar
                    nombredivisabase="MXN";
                    nombredivisaconversion="USD";
                    System.out.println("Ingrese un cantidad que desee convertir ");
                    cantidad=escanerCantidad.nextDouble();
                    datosIngresados.setNombredivisabase(nombredivisabase);
                    datosIngresados.setNombredivisaconversion(nombredivisaconversion);
                    datosIngresados.setDivisaIngresada(cantidad);
                    moneda=conversionApi.obtenermoneda(datosIngresados);
                    System.out.println("El valor de "+cantidad+" [MXN] corresponde al valor final de =>>> "+moneda.getConversion_result()+" [USD]");
                    break;
                default:
                    break;
            }
        }
    }
}

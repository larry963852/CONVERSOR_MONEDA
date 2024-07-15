package entity;

public class DatosIngresados {
    private String nombredivisabase;
    private String nombredivisaconversion;
    private double divisaIngresada;

    public DatosIngresados() {
    }

    public DatosIngresados(String nombredivisabase, String nombredivisaconversion, double divisaIngresada) {
        this.nombredivisabase = nombredivisabase;
        this.nombredivisaconversion = nombredivisaconversion;
        this.divisaIngresada = divisaIngresada;
    }

    public String getNombredivisabase() {
        return nombredivisabase;
    }

    public void setNombredivisabase(String nombredivisabase) {
        this.nombredivisabase = nombredivisabase;
    }

    public String getNombredivisaconversion() {
        return nombredivisaconversion;
    }

    public void setNombredivisaconversion(String nombredivisaconversion) {
        this.nombredivisaconversion = nombredivisaconversion;
    }

    public double getDivisaIngresada() {
        return divisaIngresada;
    }

    public void setDivisaIngresada(double divisaIngresada) {
        this.divisaIngresada = divisaIngresada;
    }
}

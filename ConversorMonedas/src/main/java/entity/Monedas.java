package entity;

import com.google.gson.annotations.SerializedName;

public class Monedas {
    @SerializedName("conversion_rate")
    private String conversion_rate;
    @SerializedName("conversion_result")
    private String conversion_result;

    public Monedas() {
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(String conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(String conversion_result) {
        this.conversion_result = conversion_result;
    }
}

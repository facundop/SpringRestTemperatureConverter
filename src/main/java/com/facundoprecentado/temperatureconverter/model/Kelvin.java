package com.facundoprecentado.temperatureconverter.model;

public class Kelvin {
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Kelvin(Double k) {
        this.value = k;
    }

}

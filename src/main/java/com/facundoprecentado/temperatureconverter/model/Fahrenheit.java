package com.facundoprecentado.temperatureconverter.model;

public class Fahrenheit {
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Fahrenheit(Double f) {
        this.value = f;
    }
}

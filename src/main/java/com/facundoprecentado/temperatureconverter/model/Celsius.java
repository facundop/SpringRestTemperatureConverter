package com.facundoprecentado.temperatureconverter.model;

public class Celsius {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Celsius(Double c) {
        this.value = c;
    }
}

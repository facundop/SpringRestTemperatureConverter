package com.facundoprecentado.temperatureconverter.model;

import com.facundoprecentado.temperatureconverter.utils.TemperatureConverter;

public class Temperature {

    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public Temperature() {

    }

    public Temperature(Celsius c) {
        this.celsius = c.getValue();
        this.fahrenheit = TemperatureConverter.fromCtoF(c.getValue());
        this.kelvin = TemperatureConverter.fromCtoK(c.getValue());
    }

    public Temperature(Fahrenheit f) {
        this.celsius = TemperatureConverter.fromFtoC(f.getValue());
        this.fahrenheit = f.getValue();
        this.kelvin = TemperatureConverter.fromFtoK(f.getValue());
    }

    public Temperature(Kelvin k) {
        this.celsius = TemperatureConverter.fromKtoC(k.getValue());
        this.fahrenheit = TemperatureConverter.fromKtoF(k.getValue());
        this.kelvin = k.getValue();
    }
}

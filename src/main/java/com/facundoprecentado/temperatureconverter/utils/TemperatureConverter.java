package com.facundoprecentado.temperatureconverter.utils;

public interface TemperatureConverter {

    static double fromCtoF(Double c) {
        return c * 1.8 + 32;
    }

    static double fromFtoC(Double f) {
        return (f - 32) / 1.8;
    }

    static double fromCtoK(Double c) {
        return c + 273.15;
    }

    static double fromKtoC(Double k) {
        return k - 273.15;
    }

    static double fromFtoK(Double f) {
        return (f + 459.67) * (5.0 / 9.0);
    }

    static double fromKtoF(Double k) {
        return (k * (9.0 / 5.0)) - 459.67;
    }

}

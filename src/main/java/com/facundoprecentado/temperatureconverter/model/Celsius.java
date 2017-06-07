package com.facundoprecentado.temperatureconverter.model;

public class Celsius {
	private Double value;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Celsius(Double value) {
		super();
		this.value = value;
	}

	public Celsius() {
		super();
	}

}

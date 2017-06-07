package com.facundoprecentado.temperatureconverter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facundoprecentado.temperatureconverter.model.Celsius;
import com.facundoprecentado.temperatureconverter.model.Fahrenheit;
import com.facundoprecentado.temperatureconverter.model.Kelvin;
import com.facundoprecentado.temperatureconverter.model.Temperature;

@RestController
public class TemperatureController {

	private Temperature temperature;

	@PostMapping("/celsius/")
	public ResponseEntity<Temperature> fromCelsius(@RequestBody Celsius value) {
		temperature = new Temperature(value);
		return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
	}

	@PostMapping("/fahrenheit/")
	public ResponseEntity<Temperature> fromFahrenheit(@RequestBody Fahrenheit value) {
		temperature = new Temperature(value);
		return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
	}

	@PostMapping("/kelvin/")
	public ResponseEntity<Temperature> fromKelvin(@RequestBody Kelvin value) {
		temperature = new Temperature(value);
		return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
	}

}
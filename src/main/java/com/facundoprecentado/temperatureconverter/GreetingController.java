package com.facundoprecentado.temperatureconverter;

import com.facundoprecentado.temperatureconverter.model.Celsius;
import com.facundoprecentado.temperatureconverter.model.Fahrenheit;
import com.facundoprecentado.temperatureconverter.model.Kelvin;
import com.facundoprecentado.temperatureconverter.model.Temperature;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private Temperature t;
    private Celsius c;
    private Kelvin k;
    private Fahrenheit f;

    @RequestMapping("/fromC/{c}")
    public
    @ResponseBody
    Temperature fromC(@PathVariable("c") Double v, Model model) {
        c = new Celsius(v);
        t = new Temperature(c);
        return t;
    }

    @RequestMapping("/fromF/{f}")
    public
    @ResponseBody
    Temperature fromF(@PathVariable("f") Double v, Model model) {
        f = new Fahrenheit(v);
        t = new Temperature(f);
        return t;
    }

    @RequestMapping("/fromK/{k}")
    public
    @ResponseBody
    Temperature fromK(@PathVariable("k") Double v, Model model) {
        k = new Kelvin(v);
        t = new Temperature(k);
        return t;
    }

}
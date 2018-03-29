package com.caner.demo.service;

import com.caner.demo.domain.Temperature;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public ConvertService() {
    }

    public double getConvertedValue(Temperature temperature) {

        String from = temperature.getFrom();
        String to = temperature.getTo();
        double value = temperature.getValue();


        if (from.equals(to)) {
            return value;
        }

        if (from.equals("Kelvin")) {
            if (to.equals("Celcius")) {

                return value - 273.15;
            }
            return (value - 273.15) * 9 / 5 + 32;
        } else {
            if (from.equals("Celcius")) {
                if (to.equals("Kelvin")) {
                    return value + 273.15;
                }
                return (value * 9 / 5) + 32;
            }
            if (to.equals("Kelvin")) {
                return (value - 32) * 5 / 9 + 273.15;
            }
            return (value - 32) * 5 / 9;
        }


    }
}

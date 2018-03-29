package com.caner.demo.domain;

public class Temperature {



    private double value;

    private String from;
    private String to;


    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Temperature(double value, String from, String to) {

        this.value = value;
        this.from = from;
        this.to = to;
    }
}

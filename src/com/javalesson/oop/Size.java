package com.javalesson.oop;

public enum Size {

    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("");
    Size(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    private String abbrevation;

    public String getAbbrevation() {
        return abbrevation;
    }


}
package com.example.cucho.barando;

/**
 * Created by Cucho on 26-May-17.
 */

class BarLocation {

    protected String address;
    protected Double x;
    protected Double y;

    public BarLocation(String address, Double x, Double y) {
        this.address = address;
        this.x = x;
        this.y = y;
    }

    public BarLocation() {
    }

    public BarLocation(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}

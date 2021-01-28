package com.company;

public class Apps {
    private Color color;

    public Apps() {
    }

    public Color getColor() {
        return color;
    }

    public Apps(Color color) {
        this.color = color;
    }
    public String getInfo(){
        return "Color: " + color ;
    }
}


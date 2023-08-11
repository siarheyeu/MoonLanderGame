package com.javarush.games.moonlander;

public class Rocket extends GameObject {
    private double speedY = 0;
    public Rocket (double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }
}

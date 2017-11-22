package com.fishtank.model.geometry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public double magnitude() {
        return Math.sqrt((x * x) + (y * y));
    }

    public Point normalize() {
        double mag = magnitude();
        return new Point(x / mag, y / mag);
    }
}

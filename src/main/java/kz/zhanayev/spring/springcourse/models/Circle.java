package kz.zhanayev.spring.springcourse.models;

import jakarta.persistence.Entity;

@Entity
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

package kz.zhanayev.spring.springcourse.models;

import jakarta.persistence.Entity;

@Entity
public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square() {

    }

    @Override
    public double area() {
        return side * side;
    }
}

package kz.zhanayev.spring.springcourse.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Shape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public abstract double area();

    public String getColor() {
        return color;
    }
}

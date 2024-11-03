package kz.zhanayev.spring.springcourse.services;

import kz.zhanayev.spring.springcourse.models.Circle;
import kz.zhanayev.spring.springcourse.models.Shape;
import kz.zhanayev.spring.springcourse.models.Square;
import kz.zhanayev.spring.springcourse.repositories.ShapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {
    private final ShapeRepository shapeRepository;

    @Autowired
    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public Shape save(Shape shape) {
        return shapeRepository.save(shape);
    }

    public List<Shape> findAll() {
        return shapeRepository.findAll();
    }

    public Shape findById(Long id) {
        return shapeRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        shapeRepository.deleteById(id);
    }

    // Overloaded draw method (ad-hoc polymorphism)
    public void draw(Circle circle) {
        System.out.println("Drawing a Circle with area: " + circle.area());
    }

    public void draw(Square square) {
        System.out.println("Drawing a Square with area: " + square.area());
    }
}

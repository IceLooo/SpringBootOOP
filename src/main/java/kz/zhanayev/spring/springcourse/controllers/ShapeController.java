package kz.zhanayev.spring.springcourse.controllers;

import kz.zhanayev.spring.springcourse.models.Circle;
import kz.zhanayev.spring.springcourse.models.Shape;
import kz.zhanayev.spring.springcourse.models.Square;
import kz.zhanayev.spring.springcourse.services.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {
    private final ShapeService shapeService;

    @Autowired
    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @PostMapping("/circle")
    public Shape createCircle(@RequestParam String color, @RequestParam double radius) {
        return shapeService.save(new Circle(color, radius));
    }

    @PostMapping("/square")
    public Shape createSquare(@RequestParam String color, @RequestParam double side) {
        return shapeService.save(new Square(color, side));
    }

    @GetMapping
    public List<Shape> getAllShapes() {
        return shapeService.findAll();
    }

    @GetMapping("/{id}")
    public Shape getShapeById(@PathVariable Long id) {
        return shapeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteShape(@PathVariable Long id) {
        shapeService.delete(id);
    }
}

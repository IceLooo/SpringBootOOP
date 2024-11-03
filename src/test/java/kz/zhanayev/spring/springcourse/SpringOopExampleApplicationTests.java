package kz.zhanayev.spring.springcourse;

import kz.zhanayev.spring.springcourse.controllers.ShapeController;
import kz.zhanayev.spring.springcourse.models.Circle;
import kz.zhanayev.spring.springcourse.models.Shape;
import kz.zhanayev.spring.springcourse.models.Square;
import kz.zhanayev.spring.springcourse.services.ShapeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringOopExampleApplicationTests {

    @Autowired
    private ShapeService shapeService;

    @Autowired
    private ShapeController shapeController;

    @Test
    void testCreateCircle() {
        Circle circle = new Circle("Red", 5.0);
        Shape savedCircle = shapeService.save(circle);
        assertThat(savedCircle).isNotNull();
        assertThat(savedCircle.getColor()).isEqualTo("Red");
    }

    @Test
    void testCreateSquare() {
        Square square = new Square("Blue", 4.0);
        Shape savedSquare = shapeService.save(square);
        assertThat(savedSquare).isNotNull();
        assertThat(savedSquare.getColor()).isEqualTo("Blue");
    }
}

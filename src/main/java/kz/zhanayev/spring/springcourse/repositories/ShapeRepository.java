package kz.zhanayev.spring.springcourse.repositories;

import kz.zhanayev.spring.springcourse.models.Shape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShapeRepository extends JpaRepository<Shape, Long> {}
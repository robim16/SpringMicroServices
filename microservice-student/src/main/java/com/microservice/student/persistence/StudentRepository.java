package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<Student, Long> {

    List<Student> findAllByCourseId(Long idCourse);
}

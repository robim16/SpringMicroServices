package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository  extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM student WHERE s.courseId = :idCourse")
    List<Student> findAllStudent(Long idCourse);

    //List<Student> findAllByCourseId(Long idCourse);
}

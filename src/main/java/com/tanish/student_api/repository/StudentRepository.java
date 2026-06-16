package com.tanish.student_api.repository;

import com.tanish.student_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//JpaRepository is a core interface in the Spring Data JPA module of the Spring ecosystem.
// It provides a JPA-specific abstraction for performing database operations in Spring Boot and Java applications.
// By extending repository interfaces, it automatically implements common CRUD, pagination, and sorting functionality without the need for SQL or boilerplate code.


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //“This is the class that talks to the database.”

}


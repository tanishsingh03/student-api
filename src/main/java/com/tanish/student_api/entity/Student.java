package com.tanish.student_api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//1. @Entity
//What it does: Marks the class as a JPA Entity.
//The Result: It tells the framework that this class should be mapped to a table in your database.
// By default, the table name will match the class name (Student).

//2. @Id
//What it does: Specifies the Primary Key of the entity.
//The Result: Every entity must have an @Id.
// This ensures that each row in your database table can be uniquely identified.
//
//3. @GeneratedValue
//What it does: Configures the strategy for generating primary keys.
//The Strategy (GenerationType.IDENTITY): This is the most common approach for MySQL and PostgreSQL.
// It tells the database to automatically increment the ID (e.g., 1, 2, 3...) whenever a new student is saved. You don't have to manually set the ID in your code.

//“private fields ko directly change nahi kar sakte, isliye getter/setter banaye”


@Entity
@Getter
@Setter
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private String email;

}

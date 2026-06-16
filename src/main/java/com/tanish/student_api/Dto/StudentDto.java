package com.tanish.student_api.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data Annotation
//This is a Lombok library annotation that automatically generates boilerplate code for you.
//By adding @Data to a class, it automatically creates:
//All Getters and Setters.
//toString(), equals(), and hashCode() methods.
//A constructor for all required (final) fields.




//@AllArgsConstructor automatically generates a constructor with one parameter for every field in your class.
//How it Works
//If you have a class with three fields (id, name, and email),
// applying this annotation will automatically create a constructor that initializes all three.


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    public Long id;
    public String name;
    public String email;




//   1. Getters and Setters: These are methods used for Encapsulation (protecting your data).
//    Getter: A method used to retrieve/read the value of a private variable.
//     Setter: A method used to update/modify the value of a private variable.
//
//2. Constructor:A special block of code used to initialize objects.
//    It has the same name as the class.
//    It runs automatically when you create a new instance of a class.



}

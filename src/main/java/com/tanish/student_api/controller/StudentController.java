package com.tanish.student_api.controller;


import com.tanish.student_api.Dto.Addstudentrequestdto;
import com.tanish.student_api.Dto.StudentDto;
import com.tanish.student_api.entity.Student;
import com.tanish.student_api.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;


//Spring Boot @RestController Definition
//The @RestController annotation in Spring Boot is a specialized version of the controller that simplifies the creation of RESTful web services.
// It is a convenience annotation that combines two primary annotations:
//     1.  @Controller: Indicates that the class is a Spring MVC Controller, responsible for handling incoming web requests and returning a response.
//     2.  @ResponseBody: Tells Spring that the return value of every method should be written directly into the HTTP response body (typically as JSON or XML) rather than trying to resolve it to a view (like HTML).
//Key Benefit: By using @RestController, you don't need to annotate every single handler method with @ResponseBody.



//@RequiredArgsConstructor: auto maticallly khud hii constructor bana dega



@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

private final StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<List<StudentDto> >getStudent(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));

    }

    @PostMapping("/")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid Addstudentrequestdto  addstudentrequestdto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addstudentrequestdto));

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
       return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id,
                                                       @RequestBody Addstudentrequestdto addstudentrequestdto){

        return ResponseEntity.ok(studentService.updateStudent(id,addstudentrequestdto));
    }


    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id,
                                                           @RequestBody Map<String,Objects> updates){

        return ResponseEntity.ok(studentService.updatePartialStudent(id,updates));
    }
}


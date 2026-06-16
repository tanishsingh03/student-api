package com.tanish.student_api;

import com.tanish.student_api.entity.Student;
import com.tanish.student_api.repository.StudentRepository;
import com.tanish.student_api.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class studentTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void testStudent(){
        List<Student> stlist= studentRepository.findAll();
        for(Student s : stlist){
            System.out.println(s);
        }

    }
}

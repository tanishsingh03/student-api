package com.tanish.student_api.service.impl;
import java.util.*;

import com.tanish.student_api.Dto.Addstudentrequestdto;
import com.tanish.student_api.Dto.StudentDto;
import com.tanish.student_api.entity.Student;
import com.tanish.student_api.repository.StudentRepository;
import com.tanish.student_api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor

public class StudentServiceimple implements StudentService{

    private  final ModelMapper modelMapper;
    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos= students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();
        return studentDtos;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student =  studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("student id not exist"+id));
       return modelMapper.map(student,StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(Addstudentrequestdto addstudentrequestdto) {
        Student newstudent=modelMapper.map(addstudentrequestdto,Student.class);
        Student student = studentRepository.save(newstudent);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student doesn't exist");
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(Long id, Addstudentrequestdto addstudentrequestdto) {
        Student student =  studentRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("student id not exist"+id));
        modelMapper.map(addstudentrequestdto,student);
        student = studentRepository.save(student);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public StudentDto updatePartialStudent(Long id, Map<String, Objects> updates) {
        Student student =  studentRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("student id not exist"+id));
        updates.forEach((field,value)->{
            switch (field){
                case "name" : student.setName(value.toString());
                break;
                case "email": student.setEmail(value.toString());
                break;
                default: throw new IllegalArgumentException("feild not valid");
            }
        });
        Student ssstudent = studentRepository.save(student);
        return modelMapper.map(ssstudent,StudentDto.class);
    }


}




//model mapper use kari hain



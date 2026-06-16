package com.tanish.student_api.service;

import com.tanish.student_api.Dto.Addstudentrequestdto;
import com.tanish.student_api.Dto.StudentDto;

import  java .util.*;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(Addstudentrequestdto addstudentrequestdto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, Addstudentrequestdto addstudentrequestdto);


    StudentDto updatePartialStudent(Long id, Map<String, Objects> updates);
}

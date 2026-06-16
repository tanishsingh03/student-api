package com.tanish.student_api.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    public class Addstudentrequestdto {
        @NotBlank(message = "name is req")
        @Size(min = 3 , max = 10 , message = "size issue")
        public String name;

        @Email
        @NotBlank(message = "emial is req")
        public String email;
    }

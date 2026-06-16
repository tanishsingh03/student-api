package com.tanish.student_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentApiApplication  {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudentApiApplication.class, args);
    }


    //Field dependency injection
//    @Autowired
//    private Dev k ;


//private final Dev2 k;
//Constructor dependecy injection
//    public StudentApiApplication(Dev2 k) {
//        this.k = k;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        k.pay();
//    }

}




//1. spring.jpa.hibernate.ddl-auto=update
//This property tells Hibernate how to handle your database tables based on your @Entity classes.
//The "Update" magic: Every time you restart your app, Hibernate looks at your Java code.
// If you added a new field (like private String phoneNumber;), Hibernate will automatically run an ALTER TABLE command to add that column to your database.
//Safety: It won't delete your existing data or columns; it only adds what is missing.
//
 // 2. spring.jpa.show-sql=true
//By default, Hibernate works silently in the background.
// If you want to see the actual SQL commands it's sending to the database (like SELECT * FROM student),
// set this to true. They will appear right in your IntelliJ or Eclipse console.
//
 // 3. spring.jpa.properties.hibernate.format_sql=true
//Without this, Hibernate prints SQL in one long, ugly line that is hard to read. This property acts like a "Prettier" for SQL, breaking the query into multiple lines with proper indentation.
//

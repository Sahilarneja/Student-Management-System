package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.api.entities.Student;
import com.api.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}

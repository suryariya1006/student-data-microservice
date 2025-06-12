package com.datamanager.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StudentDataManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataManagementApplication.class, args);
	}

}
 
 
 
 
 
 
 
 
 
 
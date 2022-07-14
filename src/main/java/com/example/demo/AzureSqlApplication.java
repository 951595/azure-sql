package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSqlApplication {
	@Autowired
	private StudentRepository repository;
	@PostMapping("/st")
	public Student saveStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	@GetMapping("/sts")
	public List<Student> getAllStudents(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSqlApplication.class, args);
	}

}

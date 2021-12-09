package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner loadData(EmployeeRepository repository) {
		return args -> {
			repository.save(new Employee("Bill", "Gates"));
			repository.save(new Employee("Mark", "Zuckerberg"));
			repository.save(new Employee("Sundar", "Pichai"));
			repository.save(new Employee("Jeff", "Bezos"));
		};
	}
}

package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/*
 * @SpringBootApplication=@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan
 */

@SpringBootApplication
public class EmpappV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmpappV1Application.class, args);
	}
}

package com.homework_5.Homework5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class Homework5Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework5Application.class, args);
	}
}
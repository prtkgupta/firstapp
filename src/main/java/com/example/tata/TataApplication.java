package com.example.tata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class TataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TataApplication.class, args);
	}

}

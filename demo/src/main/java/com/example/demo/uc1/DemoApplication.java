package com.example.demo.uc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		UC1 ob=new UC1();
		SpringApplication.run(DemoApplication.class, args);
	}


}

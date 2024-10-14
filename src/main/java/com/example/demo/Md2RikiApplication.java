package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Md2RikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Md2RikiApplication.class, args);
	}

}

@RestController
class FirstController {
	@GetMapping("/")
	public String info() {
		LocalDate localDate = LocalDate.now();
		return "Today is " + localDate + " and it is a good day to have good mood!";
	}
}
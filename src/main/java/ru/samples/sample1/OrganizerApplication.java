package ru.samples.sample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.samples.sample1")
public class OrganizerApplication {
	public static void main (String [] args) {
		SpringApplication.run(OrganizerApplication.class, args);
	}
}

package me.enmanuel.jobboard.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "me.enmanuel.jobboard.")
public class JobBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobBoardApplication.class, args);
	}
}

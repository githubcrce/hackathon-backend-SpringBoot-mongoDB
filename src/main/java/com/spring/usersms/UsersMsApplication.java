package com.spring.usersms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class UsersMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMsApplication.class, args);
	}

}

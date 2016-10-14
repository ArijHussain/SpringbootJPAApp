package com.sevenre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class Runner {

   /* @Autowired
	MongoOperations mongoOperations;*/

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}


}

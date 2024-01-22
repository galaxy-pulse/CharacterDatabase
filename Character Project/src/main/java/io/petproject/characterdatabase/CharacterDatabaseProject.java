package io.petproject.characterdatabase;

import org.springframework.boot.SpringApplication;		//Imported from SpringApplication.run
import org.springframework.boot.autoconfigure.SpringBootApplication;  //This tells us that this is the starting point for our SpringBoot App

@SpringBootApplication //Imports the anove starting point
public class CharacterDatabaseProject {

	public static void main(String[] args) {
		SpringApplication.run(CharacterDatabaseProject.class, args);

	}

}

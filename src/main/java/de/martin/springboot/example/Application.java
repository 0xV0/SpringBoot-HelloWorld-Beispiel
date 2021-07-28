package de.martin.springboot.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Martin
 */

@SpringBootApplication //Handelt sich um ein SpringBoot Programm.
public class Application {
   
	private static final Logger LOG = LoggerFactory.getLogger(Application.class); //Logger definieren.
	
	public static void main(String[] args) {
		LOG.info("Das Programm wird gestartet."); //Information (in unserem Fall nur in der Konsole) ausgeben.
		SpringApplication.run(Application.class, args); //Startet das Programm.
	}
	
}

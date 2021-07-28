package de.martin.springboot.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.martin.springboot.example.Application;

/**
 * @author Martin
 */

@RestController //Deklariert die Klasse HelloWorldController zu einem RestController.
@RequestMapping("/example") //Basis URL:      http://localhost:8080/example
public class HelloWorldController {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class); //Logger definieren.
	
    @GetMapping(value="/hello") //Anfrage (GET):      http://localhost:8080/example/hello.
    public String getHelloWorld(){ //Methode die bei entsprechender URL aufgerufen wird und einen Text zurück gibt.
    	
    	LOG.info("Die getHelloWorld Methode wurde aufgerufen."); //Information (in unserem Fall nur in der Konsole) ausgeben.
    	return "Hallo Welt! Ich funktioniere."; //Gibt den Text bei Aufruf der Methode zurück.
    	
    }
}


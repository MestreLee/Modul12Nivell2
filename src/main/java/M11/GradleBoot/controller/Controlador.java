package M11.GradleBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {
	
    @GetMapping("/")
    public String hello() {
	
    	return "Hola Món!";

    }

    @GetMapping("/{nom}")
    public String hello2(@PathVariable(name="nom") String nom) {
	
    	return String.format("Hola %s!", nom);

    }
	
}

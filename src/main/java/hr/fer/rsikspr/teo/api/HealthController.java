package hr.fer.rsikspr.teo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.lang.String;


@RestController

public class HealthController {

	@RequestMapping(method = RequestMethod.GET, value="health")
	//@GetMapping
    public String Health() {
    	return "OK";
    }
    
}
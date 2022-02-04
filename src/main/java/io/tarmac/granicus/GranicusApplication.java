package io.tarmac.granicus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GranicusApplication {

	public static void main(String[] args) {
		SpringApplication.run(GranicusApplication.class, args);
	}

	@GetMapping("/hello")
	public String getHelloWorld(){
		return "Hello World from Granicus world";
	}

}

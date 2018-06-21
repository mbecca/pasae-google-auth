package ar.edu.unlp.pasae.pasaepractica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class GoogleSecureApplication extends WebMvcConfigurerAdapter {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(GoogleSecureApplication.class, args);
	}

}

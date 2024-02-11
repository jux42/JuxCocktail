package com.example.CocktailMaker;

import com.example.CocktailMaker.Model.Cocktail;
import com.example.CocktailMaker.Model.CocktailResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CocktailMakerApplication {

	private static final Logger log = LoggerFactory.getLogger(CocktailMakerApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CocktailMakerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}




}


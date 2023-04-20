package com.spring.skaiciuotuvas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// shi anotacija yra lygi @Configuration, @EnableAutoConfiguration ir  @ComponentScan
// shi anotac nurodoma klaseje turincioje pagrindini Main metoda.
@SpringBootApplication
public class InternetinisSkaiciuotuvasApplication {

	public static void main(String[] args) {

		// programos kontrole deleguojama statiniam klases metodui run,
		// nurodant aplikacijos (root) shaknini komponenta.
		// Spring karkasas paleis aplikacija - t.y. startuos TomCat serveryje.


		SpringApplication.run(InternetinisSkaiciuotuvasApplication.class, args);
	}

}

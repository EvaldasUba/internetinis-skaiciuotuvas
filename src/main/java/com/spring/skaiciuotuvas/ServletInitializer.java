package com.spring.skaiciuotuvas;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// servlet yra java programa veikianti web serveryja
// servlet paleidziamas kai vartotojas paspaudzia nuoroda , pateikia forma, ar atliaka kito topo veiksmus
// Kiekviena kliento uzklausa (request) praeina per servlet, kuri ji perduoda kontrolerio  request maping atribute.
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InternetinisSkaiciuotuvasApplication.class);
	}

}

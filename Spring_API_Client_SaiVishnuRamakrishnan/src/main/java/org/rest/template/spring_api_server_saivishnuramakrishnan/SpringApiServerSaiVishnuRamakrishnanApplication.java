package org.rest.template.spring_api_server_saivishnuramakrishnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringApiServerSaiVishnuRamakrishnanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiServerSaiVishnuRamakrishnanApplication.class, args);
	}

}

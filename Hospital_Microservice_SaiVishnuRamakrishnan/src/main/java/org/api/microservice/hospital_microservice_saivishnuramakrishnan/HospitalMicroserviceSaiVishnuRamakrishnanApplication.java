package org.api.microservice.hospital_microservice_saivishnuramakrishnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HospitalMicroserviceSaiVishnuRamakrishnanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalMicroserviceSaiVishnuRamakrishnanApplication.class, args);
	}

}

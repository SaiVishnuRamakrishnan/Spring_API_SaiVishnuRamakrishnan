package org.api.gateway.discovery_server_saivishnuramakrishnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerSaiVishnuRamakrishnanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerSaiVishnuRamakrishnanApplication.class, args);
	}

}

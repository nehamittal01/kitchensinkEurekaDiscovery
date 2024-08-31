package org.jboss.eap.quickstarts.kitchensinkEurekaDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KitchensinkEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchensinkEurekaDiscoveryApplication.class, args);
	}

}

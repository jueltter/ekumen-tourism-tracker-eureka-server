package tech.samagua.ekumen_tourism_tracker_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EkumenTourismTrackerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkumenTourismTrackerEurekaServerApplication.class, args);
	}

}

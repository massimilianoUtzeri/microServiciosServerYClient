package com.nttdata.bootcamp.primerproyectomicroservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrimerProyectoMicroServicios1Application {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoMicroServicios1Application.class, args);
	}

}

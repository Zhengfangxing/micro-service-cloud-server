package com.william.microservicecloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicecloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigApplication.class, args);
    }
}

package com.sarra.configserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserveApplication.class, args);
    }

}

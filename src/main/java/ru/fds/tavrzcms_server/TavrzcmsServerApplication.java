package ru.fds.tavrzcms_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TavrzcmsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TavrzcmsServerApplication.class, args);
    }

}

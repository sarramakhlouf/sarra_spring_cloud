package com.sarra.universites;

import com.sarra.universites.entities.Universite;
import com.sarra.universites.repos.UniversiteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class UniversiteMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversiteMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UniversiteRepository universiteRepository) {
        return args -> {
            universiteRepository.save(Universite.builder()
                    .nom("Iset")
                    .adresse("nabeul")
                    .email("iset@nabeul.tn")
                    .anneeFondation(1999)
                    .domCode("IT")
                    .build());
        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}

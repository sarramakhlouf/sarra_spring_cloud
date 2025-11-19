package com.sarra.domaine;

import com.sarra.domaine.entities.Domaine;
import com.sarra.domaine.repos.DomaineRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DomaineMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomaineMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(DomaineRepository domaineRepository) {
        return args -> {
            domaineRepository.save(Domaine.builder()
                    .domName("Info Tech")
                    .domCode("IT")
                    .build());
            domaineRepository.save(Domaine.builder()
                    .domName("Marketing")
                    .domCode("MK")
                    .build());
        };
    }

}

package com.sarra.universites.service;

import com.sarra.universites.dto.APIResponseDto;
import com.sarra.universites.dto.DomaineDto;
import com.sarra.universites.dto.UniversiteDto;
import com.sarra.universites.entities.Universite;
import com.sarra.universites.repos.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversiteService{

    private UniversiteRepository universiteRepository;
    private APIClient apiClient;
    //private WebClient webClient;

    @Override
    public APIResponseDto getUniversiteById(Long id) {
        String dname;
        Universite universite = universiteRepository.findById(id).get();

        /*DomaineDto domaineDto = webClient.get()
                .uri("http://localhost:8080/api/domaines/" +
                        universite.getDomCode())
                .retrieve()
                .bodyToMono(DomaineDto.class)
                .block();*/
        DomaineDto domaineDto;
        try {
            domaineDto = apiClient.getDomByCode(universite.getDomCode());
        } catch (Exception e) {
            domaineDto = null; // en cas d'erreur Feign/503
        }

        if (domaineDto == null)
            dname = "NOT AVAILABLE";
        else
            dname = domaineDto.getDomName();

        UniversiteDto universiteDto = new UniversiteDto(
                universite.getId(),
                universite.getNom(),
                universite.getAdresse(),
                universite.getEmail(),
                universite.getAnneeFondation(),
                universite.getDomCode(),
                dname
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setUniversiteDto(universiteDto);
        apiResponseDto.setDomaineDto(domaineDto);

        return apiResponseDto;
    }
}


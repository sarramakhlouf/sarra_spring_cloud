package com.sarra.domaine.service;

import com.sarra.domaine.dto.DomaineDto;
import com.sarra.domaine.entities.Domaine;
import com.sarra.domaine.repos.DomaineRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DomaineServiceImpl implements DomaineService{
    @Autowired
    DomaineRepository domaineRepository;

    @Override
    public DomaineDto getDomaineByCode(String code) {
        Domaine dom = domaineRepository.findByDomCode(code);

        DomaineDto domaineDto = new DomaineDto(
                dom.getId(),
                dom.getDomName(),
                dom.getDomCode()
        );
        return domaineDto;
    }
}

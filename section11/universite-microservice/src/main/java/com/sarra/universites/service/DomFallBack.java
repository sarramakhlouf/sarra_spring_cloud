package com.sarra.universites.service;

import com.sarra.universites.dto.DomaineDto;
import org.springframework.stereotype.Component;

@Component
public class DomFallBack implements  APIClient{
    @Override
    public DomaineDto getDomByCode(String domaineCode) {
        return null;
    }

}

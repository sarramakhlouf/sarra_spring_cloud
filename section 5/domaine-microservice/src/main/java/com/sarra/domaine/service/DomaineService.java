package com.sarra.domaine.service;

import com.sarra.domaine.dto.DomaineDto;

public interface DomaineService {
    DomaineDto getDomaineByCode(String code);
}

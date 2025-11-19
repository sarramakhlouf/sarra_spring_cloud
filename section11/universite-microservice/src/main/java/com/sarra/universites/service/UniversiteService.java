package com.sarra.universites.service;

import com.sarra.universites.dto.APIResponseDto;
import com.sarra.universites.dto.UniversiteDto;

public interface UniversiteService {
    APIResponseDto getUniversiteById(Long id);
}

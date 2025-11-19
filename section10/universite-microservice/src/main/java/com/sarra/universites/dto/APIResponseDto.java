package com.sarra.universites.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private UniversiteDto universiteDto;
    private DomaineDto domaineDto;
}

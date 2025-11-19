package com.sarra.domaine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomaineDto {
    private Long id;
    private String domName;
    private String domCode;
}

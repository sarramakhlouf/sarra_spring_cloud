package com.sarra.universites.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniversiteDto {
    private Long id;

    private String nom;
    private String adresse;
    private String email;
    private int anneeFondation;
    private String domCode;
    private String DomName;
}

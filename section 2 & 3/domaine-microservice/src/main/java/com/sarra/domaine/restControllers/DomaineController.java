package com.sarra.domaine.restControllers;

import com.sarra.domaine.dto.DomaineDto;
import com.sarra.domaine.service.DomaineService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/domaines")
@AllArgsConstructor
public class DomaineController {
    private DomaineService domaineService;

    @GetMapping ("{code}")
    public ResponseEntity<DomaineDto> getDomByCode(@PathVariable("code")String code ) {
        return new ResponseEntity<DomaineDto>(
                domaineService.getDomaineByCode(code), HttpStatus.OK);
    }
}

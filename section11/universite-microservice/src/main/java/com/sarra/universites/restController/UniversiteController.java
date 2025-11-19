package com.sarra.universites.restController;

import com.sarra.universites.config.Configuration;
import com.sarra.universites.dto.APIResponseDto;
import com.sarra.universites.service.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/universites")
@AllArgsConstructor
public class UniversiteController {

    @Autowired
    Configuration configuration;

    private UniversiteService universiteService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getUniById(@PathVariable("id") Long id ) {
        return new ResponseEntity<APIResponseDto>(
                universiteService.getUniversiteById(id), HttpStatus.OK);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}

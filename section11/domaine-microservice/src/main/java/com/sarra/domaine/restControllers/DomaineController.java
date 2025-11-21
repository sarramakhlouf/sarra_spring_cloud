package com.sarra.domaine.restControllers;

import com.sarra.domaine.config.Configuration;
import com.sarra.domaine.dto.DomaineDto;
import com.sarra.domaine.entities.Domaine;
import com.sarra.domaine.service.DomaineService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/domaines")
//@AllArgsConstructor
public class DomaineController {
    private DomaineService domaineService;

//    @Value("${build.version}")
//    private String buildVersion;
//
//    @Autowired
//    Configuration configuration;

    public DomaineController(DomaineService domaineService){
        this.domaineService = domaineService;
    }

    @GetMapping ("{code}")
    public ResponseEntity<DomaineDto> getDomByCode(@PathVariable("code")String code ) {
        return new ResponseEntity<DomaineDto>(
                domaineService.getDomaineByCode(code), HttpStatus.OK);
    }

//    @GetMapping("/version")
//    public ResponseEntity<String> version() {
//        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
//    }
//
//    @GetMapping("/author")
//    public ResponseEntity<String> retrieveAuthorInfo() {
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(configuration.getName()+" "+configuration.getEmail() );
//    }

}

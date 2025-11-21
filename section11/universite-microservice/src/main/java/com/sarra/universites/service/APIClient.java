package com.sarra.universites.service;

import com.sarra.universites.dto.DomaineDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "DOMAINE")
//@FeignClient(value = "DOMAINE",fallback = DomFallBack.class)
@FeignClient(name = "DOMAINE")
public interface APIClient {
    @GetMapping("api/domaines/{code}")
    DomaineDto getDomByCode(@PathVariable("code") String code);

}

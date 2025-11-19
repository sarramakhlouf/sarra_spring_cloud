package com.sarra.domaine.repos;

import com.sarra.domaine.entities.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineRepository extends JpaRepository<Domaine, Long> {
    Domaine findByDomCode(String code);

}

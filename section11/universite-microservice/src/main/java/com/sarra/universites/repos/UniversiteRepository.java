package com.sarra.universites.repos;

import com.sarra.universites.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}

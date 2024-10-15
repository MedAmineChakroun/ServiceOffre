package com.iset.examen.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.iset.examen.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
    // Additional query methods can be defined here if needed
}
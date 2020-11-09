package com.example.vente_voitures.repository;

import java.util.Set;

import com.example.vente_voitures.entite.Concessionnaires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Concessionnaires")
public interface ConcessionnairesRepository extends JpaRepository<Concessionnaires, Integer> {
    Set<Concessionnaires> findConcessionnairesByNameStartsWith(String name);
}

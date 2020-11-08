package com.example.vente_voitures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Concessionnaires")
public interface ConcessionnairesRepository extends JpaRepository<Concessionnaires, Integer> {
}

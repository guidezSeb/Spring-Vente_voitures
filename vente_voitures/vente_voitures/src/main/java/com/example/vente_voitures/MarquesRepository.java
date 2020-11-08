package com.example.vente_voitures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Marques")
public interface MarquesRepository extends JpaRepository<Marques, Integer> {
}

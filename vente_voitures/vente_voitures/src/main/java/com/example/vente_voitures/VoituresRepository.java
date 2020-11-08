package com.example.vente_voitures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Voitures")
public interface VoituresRepository extends JpaRepository<Voitures, Integer> {
}

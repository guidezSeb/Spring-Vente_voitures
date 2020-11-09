package com.example.vente_voitures.repository;

import java.util.Set;

import com.example.vente_voitures.entite.Voitures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Voitures")
public interface VoituresRepository extends JpaRepository<Voitures, Integer> {
    Set<Voitures> findVoituresByNameStartsWith(String name);
}

package com.example.vente_voitures.repository;

import java.util.Set;

import com.example.vente_voitures.entite.Marques;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Marques")
public interface MarquesRepository extends JpaRepository<Marques, Integer> {
Set<Marques> findMarquesByNameStartsWith(String name);
}

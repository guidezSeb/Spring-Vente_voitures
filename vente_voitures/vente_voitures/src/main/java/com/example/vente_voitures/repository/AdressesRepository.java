package com.example.vente_voitures.repository;

import java.util.Set;

import com.example.vente_voitures.entite.Adresses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Adresses")
public interface AdressesRepository extends JpaRepository<Adresses, Integer> {
    Set<Adresses> findAdressesByNameStartsWith(String name);
}

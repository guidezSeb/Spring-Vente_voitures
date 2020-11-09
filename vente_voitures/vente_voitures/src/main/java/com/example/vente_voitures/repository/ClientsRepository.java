package com.example.vente_voitures.repository;

import java.util.Set;

import com.example.vente_voitures.entite.Clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="Clients")
public interface ClientsRepository extends JpaRepository<Clients, Integer> {
    Set<Clients> findClientsByNameStartsWith(String name);
}

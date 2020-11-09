package com.example.vente_voitures.controllers;

import java.util.Optional;
import java.util.Set;

import com.example.vente_voitures.entite.Clients;
import com.example.vente_voitures.repository.ClientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/Clients")
public class ClientsController{

    @Autowired
    private ClientsRepository clientsRepository;

    @GetMapping
    public Iterable<Clients> GetClients(){
        return clientsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Clients> getClients(@PathVariable("id") int id)
    {
        return clientsRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Set<Clients> findClientsByNameStartsWith(@PathVariable("name") String name)
    {
        return clientsRepository.findClientsByNameStartsWith(name);
    }
}
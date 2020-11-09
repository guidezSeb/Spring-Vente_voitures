package com.example.vente_voitures.controllers;

import java.util.Optional;
import java.util.Set;

import com.example.vente_voitures.entite.Adresses;
import com.example.vente_voitures.repository.AdressesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/Adresses")
public class AdressesController{

    @Autowired
    private AdressesRepository adressesRepository;

    @GetMapping
    public Iterable<Adresses> GetAdresses(){
        return adressesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Adresses> getAdresses(@PathVariable("id") int id)
    {
        return adressesRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Set<Adresses> findAdressesByNameStartsWith(@PathVariable("name") String name)
    {
        return adressesRepository.findAdressesByNameStartsWith(name);
    }

  
}
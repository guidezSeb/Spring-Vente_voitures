package com.example.vente_voitures.controllers;

import java.util.Optional;
import java.util.Set;

import com.example.vente_voitures.entite.Marques;
import com.example.vente_voitures.repository.MarquesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/Marques")
public class MarquesController{

    @Autowired
    private MarquesRepository marquesRepository;

    @GetMapping
    public Iterable<Marques> GetMarques(){
        return marquesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Marques> getMarques(@PathVariable("id") int id)
    {
        return marquesRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Set<Marques> findMarquesByNameStartsWith(@PathVariable("name") String name)
    {
        return marquesRepository.findMarquesByNameStartsWith(name);
    }
}
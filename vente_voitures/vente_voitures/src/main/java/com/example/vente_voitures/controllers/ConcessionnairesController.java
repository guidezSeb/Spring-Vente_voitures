package com.example.vente_voitures.controllers;

import java.util.Optional;
import java.util.Set;

import com.example.vente_voitures.entite.Concessionnaires;
import com.example.vente_voitures.repository.ConcessionnairesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/Concessionnaires")
public class ConcessionnairesController{

    @Autowired
    private ConcessionnairesRepository concessionnairesRepository;

    @GetMapping
    public Iterable<Concessionnaires> GetConcessionnaires(){
        return concessionnairesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Concessionnaires> getConcessionnaires(@PathVariable("id") int id)
    {
        return concessionnairesRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Set<Concessionnaires> findConcessionnairesByNameStartsWith(@PathVariable("name") String name)
    {
        return concessionnairesRepository.findConcessionnairesByNameStartsWith(name);
    }
}
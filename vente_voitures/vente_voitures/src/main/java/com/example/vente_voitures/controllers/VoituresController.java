package com.example.vente_voitures.controllers;

import java.util.Optional;
import java.util.Set;

import com.example.vente_voitures.entite.Voitures;
import com.example.vente_voitures.repository.VoituresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/Voitures")
public class VoituresController{

    @Autowired
    private VoituresRepository voituresRepository;

    @GetMapping
    public Iterable<Voitures> GetVoitures(){
        return voituresRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Voitures> getVoitures(@PathVariable("id") int id)
    {
        return voituresRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Set<Voitures> findVoituresByNameStartsWith(@PathVariable("name") String name)
    {
        return voituresRepository.findVoituresByNameStartsWith(name);
    }
}
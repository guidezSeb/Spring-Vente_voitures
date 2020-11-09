package com.example.vente_voitures.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data 
@Entity
public class Concessionnaires {
    @Id
    private int id;
    private String name;

    public Concessionnaires() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    @JoinColumn(name = "Concessionnaires_id")
    private Set<Adresses> Adresses = new HashSet<Adresses>();

     @ManyToMany
     @JoinTable(name = "Marques_Concessionaires",
        joinColumns = @JoinColumn(name = "Concessionnaires_id"),
        inverseJoinColumns = @JoinColumn(name = "Marques_id"))
    private Set<Marques> Marques = new HashSet<Marques>();


}

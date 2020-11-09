package com.example.vente_voitures.entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data 
@Entity
public class Marques {
    @Id
    private int id;
    private String name;

    public Marques() {
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
    @JoinColumn(name = "Marques_id")
    private Set<Voitures> Voitures  = new HashSet<Voitures>();

    @ManyToMany(mappedBy = "Marques")
    private Set<Concessionnaires> Concessionnaires  = new HashSet<Concessionnaires>();
}

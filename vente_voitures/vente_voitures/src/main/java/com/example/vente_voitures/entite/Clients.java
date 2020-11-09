package com.example.vente_voitures.entite;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data 
@Entity
public class Clients {
    @Id
    private int id;
    private String name;

    public Clients() {
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
    @JoinColumn(name = "Clients_id")
    private Set<Voitures> Voitures  = new HashSet<Voitures>();
}

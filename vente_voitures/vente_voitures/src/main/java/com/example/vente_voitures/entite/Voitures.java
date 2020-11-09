package com.example.vente_voitures.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Voitures {
    @Id
    private int id;
    private String name;

    public Voitures() {
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
}

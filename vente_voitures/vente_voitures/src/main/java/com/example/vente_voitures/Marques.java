package com.example.vente_voitures;


import javax.persistence.Entity;
import javax.persistence.Id;

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
}
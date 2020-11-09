package com.example.vente_voitures.entite;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresses {
    @Id
    private int id;
    private String name;

    public Adresses() {
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

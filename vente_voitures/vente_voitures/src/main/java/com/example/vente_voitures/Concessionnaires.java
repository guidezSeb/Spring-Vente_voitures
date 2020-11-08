package com.example.vente_voitures;


import javax.persistence.Entity;
import javax.persistence.Id;

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
}

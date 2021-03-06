package com.codeclan.example.jurassic.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "type")
    private String type;

    @Column(name = "diet")
    private String diet;

    @Column(name= "stomachCapacity")
    private int stomachCapacity;

    @Column(name = "image")
    private String image;

    @JsonIgnoreProperties("species")
    @OneToMany(mappedBy = "species", fetch = FetchType.LAZY)
    private List<Dinosaur> dinosaurs;

    public Species() {

    }

    public Species(String type, String diet, int stomachCapacity, String image) {
        this.type = type;
        this.diet = diet;
        this.stomachCapacity = stomachCapacity;
        this.image = image;
        this.dinosaurs = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getStomachCapacity() {
        return stomachCapacity;
    }

    public void setStomachCapacity(int stomachCapacity) {
        this.stomachCapacity = stomachCapacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }
}




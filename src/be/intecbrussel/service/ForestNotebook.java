package be.intecbrussel.service;

import be.intecbrussel.entities.animal_entities.Animal;
import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.List;

public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook(){

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    public void addAnimal(Animal animal){
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
    }

    public void getPlant(Plant plant){

    }
    public void printNotebook(){

    }

    public void sortAnimalByName(){

    }
    public void sortPlantByName(){

    }
}

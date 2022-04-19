package be.intecbrussel.entities.animal_entities;

import be.intecbrussel.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plant = new Plant(getName());
        Set<Plant> plantDiet = new HashSet<>();
        plantDiet.add(plant);
    }

    public void printDiet(){
        System.out.println("This animal eats:");
        System.out.println(getPlantDiet());
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}


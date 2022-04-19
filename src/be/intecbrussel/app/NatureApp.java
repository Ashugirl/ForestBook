package be.intecbrussel.app;

import be.intecbrussel.entities.animal_entities.Animal;
import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.*;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
       /* Herbivore greenfinch = new Herbivore("Greenfinch", .1, 10, 10);
        greenfinch.addPlantToDiet(new Plant("sunflower seeds"));
        greenfinch.addPlantToDiet(new Plant("nigela seeds"));
        greenfinch.printDiet();

        */

        Weed nettles = new Weed("Stinging nettles", 1.5);
        nettles.setArea(2.0);
        Bush brambles = new Bush("Brambles", 2.4);
        brambles.setFruit("blackberry");
        brambles.setLeafType(LeafType.SPEAR);
        System.out.println(brambles);
        Tree oak = new Tree("Oak", 20);
        oak.setLeafType(LeafType.HAND);
        Flower hyacinth = new Flower("Hyacinth", .15);
        hyacinth.setSmell(Scent.SWEET);
        System.out.println(nettles);
        System.out.println(oak);
        System.out.println(hyacinth);
        Carnivore buzzard = new Carnivore("Buzzard", 5, .25, .25);
        buzzard.setMaxFoodSize(.10);
        System.out.println(buzzard);
        Omnivore crow = new Omnivore("Crow");
        crow.setMaxFoodSize(.5);
        crow.addPlantToDiet(new Plant("walnut"));
        System.out.println(crow);
        Herbivore roeDeer = new Herbivore("Roe deer");
        roeDeer.addPlantToDiet(brambles);
        roeDeer.addPlantToDiet(new Plant("oak leaves"));
        roeDeer.printDiet();
    }
}

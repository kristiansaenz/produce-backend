package com.saenz.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class FarmerDBseeder implements CommandLineRunner {

    @Autowired
    FarmerRepository farmerRepository;

    @Override
    public void run(String... strings) throws Exception {

        List<Item> items1 = new ArrayList<>();

        Farmer ryan = new Farmer(
                "Ryan Jalufka",
                "djscotty@gm.com",
                new Address(
                        "789 Weedman Dr",
                        "Einsendeln",
                        "Windhelm",
                        "278978",
                        "Skyrim"),
                new Booth(
                        "Magical Veggies",
                        "veggies made with magical potions",
                        "8am - 4pm", Arrays.asList(
                            new Item("1", "Apple", "Red apple with hint of lemon", 2.00, 5),
                            new Item("2", "Pear", "Yellow pears that are very sweet", 3.00, 5),
                            new Item("3", "Zucchini", "Nommy zucchini", 2.00, 8),
                            new Item("4", "Potatoes", "Purple potatoes that are scrumptious", 1.50, 10)))
        );

        Farmer kristian = new Farmer(
                "Kristian Saenz",
                "krisaenz@gm.com",
                new Address(
                        "789 Weedman Dr",
                        "Einsendeln",
                        "Windhelm",
                        "278978",
                        "Albany"),
                new Booth(
                        "Kri's Veggie Elixar",
                        "veggies made with magical DARK potions",
                        "12pm - 4pm", Arrays.asList(
                        new Item("1", "Carrot", "Carrots much sweet", 2.00, 5),
                        new Item("2", "Tomato", "Red juicy tomatoes", 3.00, 5),
                        new Item("3", "Squash", "Nommy squashy squash", 2.00, 8),
                        new Item("4", "Cucumber", "Cucumbers for pickling", 1.50, 10)))
        );

        //drop all farmers
        this.farmerRepository.deleteAll();

        //add farmers to database
        //put them into a list and save that list to db
        List<Farmer> farmers = Arrays.asList(ryan, kristian);

        this.farmerRepository.saveAll(farmers);




    }

}

//Command Line Runner means that Spring will automatically execute this when app is ran

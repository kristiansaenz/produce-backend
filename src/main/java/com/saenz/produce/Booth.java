package com.saenz.produce;

import java.util.List;


public class Booth {
    private String name;
    private String description;
    private String hours;
    private List<Item> items;

    public Booth(String name, String description, String hours, List<Item> items) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

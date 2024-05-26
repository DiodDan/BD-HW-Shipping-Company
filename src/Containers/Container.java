package Containers;

import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private double height;
    private double width;
    private double length;
    private String type;
    private double freeSpace;
    private double usedWeight;

    public Container(String type, double height, double width, double length) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
        this.freeSpace = height * width * length;
    }

    public void addItem(Item item, int amount) throws Exception {
        if (item.getVolume() * amount > this.freeSpace) {
            throw new Exception("Not enough space in the container");
        }
        freeSpace -= item.getVolume() * amount;
        usedWeight += item.getWeight() * amount;
    }

    public double getVolume() {
        return height * width * length;
    }

    public double getFreeSpace() {
        return freeSpace;
    }

    public void printInfo() {
        System.out.println("Container type: " + type + "\nContainer Volume: " + getFreeSpace());
    }

}

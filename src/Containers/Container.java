package Containers;

import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private double height;
    private double width;
    private double length;
    private String type;
    private double usedSpace;
    private double usedWeight;

    public Container(String type, double height, double width, double length) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calculateVolume() {
        return height * width * length;
    }

    public void printInfo() {
        System.out.println("Container type: " + type + "\nContainer Volume: " + calculateVolume());
    }

}

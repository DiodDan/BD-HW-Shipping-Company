package Containers;

public class Container {
    private double height;
    private double width;
    private double length;
    private String type;

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

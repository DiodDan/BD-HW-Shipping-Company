package Items;

public class Item {
    private String name;
    private double length;
    private double width;
    private double height;
    private double weight;
    private int amount;

    public Item(String name, double length, double width, double height, double weight, int amount) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.amount = amount;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }

    public String getDimensions(){
        return length + "*" + width + "*" + height;
    }

    public void setAmount(int amount) throws Exception {
        if (amount < 0)
            throw new Exception("Amount of items cannot be negative.");
        this.amount = amount;
    }

    public void printInfo() {
        System.out.println("Item: " + name + "\nVolume: " + getVolume() + "\nWeight: " + weight + "\nAmount: " + amount + "\nDimensions: " + getDimensions());
    }

}

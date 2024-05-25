package Methods;

import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    List<Item> items = new ArrayList<Item>();

    public double totalVolume() {
        double totalVolume = 0;
        for (Item item : items) {
            totalVolume += item.getVolume() * item.getAmount();
        }
        return totalVolume;
    }

    public double totalWeight() {
        double totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight() * item.getAmount();
        }
        return totalWeight;
    }

    public void bestShipping() {

    }

    public void shippingPrice() {

    }

    public void addItems(List<Item> addItems) throws Exception {
        boolean found = false;

        for(Item addItem : addItems) {
            found = false;
            if(!this.items.isEmpty()) {
                for (Item item : this.items) {
                    if (addItem.getName().equals(item.getName()) && addItem.getDimensions().equals(item.getDimensions())) {
                        item.setAmount(item.getAmount() + addItem.getAmount());
                        found = true;
                        break;
                    }
                }
            }
            if(!found) {
                this.items.add(addItem);
            }
        }
    }

    public void addOrder() {

    }

    public void printItemsInfo() {
        for (Item item : this.items) {
            item.printInfo();
        }
    }

    public void printOrder() {

    }
}

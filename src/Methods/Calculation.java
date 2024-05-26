package Methods;

import Containers.Container;
import Items.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Calculation {
    List<Item> items = new ArrayList<Item>();
    boolean bestShipmentWithExplanation;

    public Calculation(boolean bestShipmentWithExplanation) {
        this.bestShipmentWithExplanation = bestShipmentWithExplanation;
    }

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

    public String bestShipping() throws Exception {
        List<Container> containers = new ArrayList<Container>();
        int amount = 0;
        int i = 0;
        int localAddAmount = 0;

        this.items.sort(Comparator.comparing(Item::getSpecificWeight).reversed());

        for (Item item : this.items) {
            amount = item.getAmount();
            i = 0;
            while (amount > 0) {
                if (containers.size() == i)
                    containers.add(new Container("Big", 259, 243, 1201));
                Container container = containers.get(i);
                if (container.getFreeSpace() >= item.getVolume()) {
                    localAddAmount = Math.min(amount, (int) (container.getFreeSpace() / item.getVolume()));
                    if (this.bestShipmentWithExplanation)
                        System.out.println("Adding " + localAddAmount + " " + item.getName() + " to container " + i);
                    container.addItem(item, localAddAmount);
                    amount -= localAddAmount;
                }
                i++;
            }
        }

        Container smallContainer = new Container("Small", 259, 243, 606);

        if (containers.isEmpty()) {
            return "No containers needed";
        } else if (containers.getLast().getVolume() - containers.getLast().getFreeSpace() <= smallContainer.getVolume()) {
            return "Big Containers: " + (containers.size() - 1) + "\nSmall Containers: 1";
        } else {
            return "Big Containers: " + containers.size();
        }


    }

    public void shippingPrice() {

    }

    public void addItems(List<Item> addItems) throws Exception {
        boolean found = false;

        for (Item addItem : addItems) {
            found = false;
            if (!this.items.isEmpty()) {
                for (Item item : this.items) {
                    if (addItem.getName().equals(item.getName()) && addItem.getDimensions().equals(item.getDimensions())) {
                        item.setAmount(item.getAmount() + addItem.getAmount());
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
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

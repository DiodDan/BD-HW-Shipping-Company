import Items.Item;
import Containers.Container;
import Methods.Calculation;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Item item = new Item("Box", 4, 10, 10, 10, 3);
        item.printInfo();
        Container container = new Container("Big Container", 4, 10, 10);
        container.printInfo();
        Calculation calculation = new Calculation();
        List<Item> itemList = List.of(new Item("Box", 4, 10, 10, 10, 3),
                                      new Item("Box1", 4, 10, 10, 15, 4));
        List<Item> itemList1 = List.of(new Item("Box1", 4, 10, 10, 10, 3),
                                        new Item("Box1", 4, 10, 10, 15, 4));
        calculation.addItems(itemList);
        calculation.addItems(itemList1);
        System.out.println(calculation.totalVolume());
        System.out.println(calculation.totalWeight());
        calculation.printItems();
    }
}

import Items.Item;
import Containers.Container;
import Methods.Calculation;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Calculation calculation = new Calculation(false);
        List<Item> itemList = List.of(new Item("Laptop", 60, 50, 50, 6.5, 100), // 503.9 in one container
                                      new Item("Mouse", 30, 30, 20, 0.2, 200), // 4199.29 in one container
                                      new Item("Desktop", 100, 150, 50, 20, 150), // 100.78 in one container
                                      new Item("LCD Screens", 120, 140, 80, 2.6, 200)); // 56.24 in one container
        calculation.addItems(itemList);
        System.out.println(calculation.bestShipping());

    }
}

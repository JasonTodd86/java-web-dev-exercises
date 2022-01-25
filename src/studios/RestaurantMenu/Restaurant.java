package studios.RestaurantMenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {
        public static void main(String[] args) {
            Date today = Calendar.getInstance().getTime();
            MenuItems newItem1 = new MenuItems("garlic", 4.99, "smelly", "seasoning", false);
            MenuItems newItem2 = new MenuItems("chicken", 10.99, "bird", "main course", true);
            MenuItems newItem3 = new MenuItems("bread", 0.00, "baked dough", "appetizer", false);
        }

        ArrayList<MenuItems> startingMenu = new ArrayList<>();

//        Menu ourLunchMenu = new Menu(today, startingMenu);
//
//        ourLunchMenu.addItem(newItem1);
//        ourLunchMenu.addItem(newItem2);
//        ourLunchMenu.addItem(newItem3);
//
//        ourLunchMenu.printMenu();
//        ourLunchMenu.removeItem(newItem1);
//        ourLunchMenu.printMenu();

    }

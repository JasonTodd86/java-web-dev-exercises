package studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;
//import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItems> menu = new ArrayList<>();
    private Date lastUpdated;

//constructors for both variables:
    public Menu(ArrayList<MenuItems> menuItems) {
        this.menu = menuItems;
    }

    public Menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //    getters and setters for every constructor:
    public ArrayList<MenuItems> getMenuItems() {
        return menu;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menu = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }





}

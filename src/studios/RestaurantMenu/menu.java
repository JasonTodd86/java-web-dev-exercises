package studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class menu {
    private ArrayList<menuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;

//constructors for both variables:
    public menu(ArrayList<studios.RestaurantMenu.menuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //    getters and setters for every constructor:
    public ArrayList<studios.RestaurantMenu.menuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<studios.RestaurantMenu.menuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

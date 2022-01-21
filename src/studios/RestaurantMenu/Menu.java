package studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;
//import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItems> menu = new ArrayList<>();
    private Date lastUpdated;

//constructors for both variables:
    public Menu(ArrayList<MenuItems> menu, Date lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

    //    getters and setters for every constructor:


    public ArrayList<MenuItems> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItems> menu) {
        this.menu = menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> addItems(MenuItems item){
        this.menu.add(item);
        return this.menu;
    }





}

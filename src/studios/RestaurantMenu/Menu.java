package studios.RestaurantMenu;

import java.awt.*;
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

    public ArrayList<MenuItems> removeItems(MenuItems item){
        int toBeRemoved = -1;
        for(int i=0; i < menu.size(); i++){
            if(menu.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.menu.add(item);
        return this.menu;
    }

    public String menuUpdated(){
        return ("This menu of ours was last updated on " + this.lastUpdated);
    }

    public void printItem(MenuItems item){
        System.out.println((item.getDescription()));
    }

    public void printMenu(){
        for(int i=0; i < menu.size(); i++){
            System.out.println(menu.get(i).getName() + ": " + menu.get(i).getDescription() + ". " + menu.get(i).getPrice());
        }
    }



}

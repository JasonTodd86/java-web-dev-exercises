package studios.RestaurantMenu;

public class MenuItems {
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isItemNew;

    public MenuItems(String itemName, double itemPrice, String itemDescription, String itemCategory, boolean isItemNew) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.isItemNew = isItemNew;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isItemNew() {
        return isItemNew;
    }
    public void setItemNew(boolean itemNew) {
        isItemNew = itemNew;
    }


    public static void printSingleItem(MenuItems item){
        System.out.println(item);
    }
    //    private ArrayList<> category;

//    getters and setters for every constructor
    //should be able to add items and prices and description of it
}

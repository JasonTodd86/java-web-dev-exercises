package studios.RestaurantMenu;

public class MenuItems {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItems(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public static void printSingleItem(MenuItems item){
        System.out.println(item);
    }
    //    private ArrayList<> category;

//    getters and setters for every constructor
    //should be able to add items and prices and description of it
}

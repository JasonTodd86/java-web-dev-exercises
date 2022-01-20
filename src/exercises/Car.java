package exercises;

public class Car {
    private String color;
    private String make;
    private String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return (make+ " brand car, model " + model + " in the beautiful color of " + color);
    }

    public boolean equals(Car name){
        if(name == this){
            return true;
        }
        if(name.getClass() != getClass()){
            return false;
        }
        Car theCar = (Car)name;
        return theCar.getColor() == getColor();
    }
}

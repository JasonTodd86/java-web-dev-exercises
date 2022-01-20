package exercises;

public class MiscRunner {

    public static void main(String[] args) {
        Car myCar = new Car("blue", "Ford", "Escape");
        Car myCar2 = new Car("blue", "Ford", "Escape");
        Car theirCar = new Car("red", "Honda", "CR-V");
        System.out.println(myCar.equals(myCar));
        System.out.println(myCar.toString());
    }

}

package exercises.technology;

import org.junit.Test;

public class Program {
    public static void main(String[] args) {


        Computer helios = new Computer(500, 16, "A really cool graphics card!");
//        System.out.println("The current storage is " + helios.getStorage());
//        System.out.println("The current storage is " + helios.getRam());
//        helios.increaseStorage(250);
//        helios.increaseRam(16);
//        System.out.println("The increased storage is " + helios.getStorage());
//        System.out.println("The increased storage is " + helios.getRam());
//        System.out.println("What kind of graphics card does it have? " + helios.getGraphicsCard());
        System.out.println(helios.getID());

        Laptop helios1 = new Laptop(500, 32, "A pretty rad graphics card!", 20);
//        System.out.println(helios1.isClunky());
//        System.out.println(helios1.getWeight());
//        System.out.println(helios1.getStorage());
//        System.out.println(helios1.getGraphicsCard());
        System.out.println(helios1.getID());

        Smartphone iPhone = new Smartphone(500, 16, "N/A", 42, 7000);
//        System.out.println(iPhone.getGraphicsCard());
//        System.out.println(iPhone.getNumOfPhotos());
//        System.out.println(iPhone.getNumOfApps());
//        iPhone.downloadApp();
//        iPhone.takePhoto();
//        System.out.println(iPhone.getNumOfPhotos());
//        System.out.println(iPhone.getNumOfApps());
//        System.out.println(iPhone.getStorage());
        System.out.println(iPhone.getID());
    }
}

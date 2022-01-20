package exercises;
import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length?");
        double length = input.nextDouble();

        System.out.println("What is the width?");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is about " + area + "!");

    }

}

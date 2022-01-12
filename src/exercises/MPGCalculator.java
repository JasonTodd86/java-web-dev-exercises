package exercises;
import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles has thou journeyed, weary traveler?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas hast thine vehicle burned?");
        double gallonsOfGas = input.nextDouble();

        double mpg = milesDriven/gallonsOfGas;
        System.out.println("Thy noble vehicle is gettingeth " + mpg + " miles per gallon, stranger.");
    }
}

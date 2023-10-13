import java.util.Scanner;

public class EkoTaxi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");
        double distance = input.nextDouble();

        double totalFee = calculateFee(distance);
        System.out.println("Total Fee: " + totalFee + " TL");






    }

    public static double calculateFee(double distance) {
        double beginning = 8.00;
        double kmPer = 12.50;

        double totalFee = beginning + (kmPer * distance);
        return totalFee;
    }
}

package Programming_elements_31_12_25;
import java.util.Scanner;
public class Level2 {
    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Program 1: Calculate Simple Interest
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println(
                "The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );


        // Program 2: Convert weight from pounds to kilograms
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        double weightInKg = weightInPounds / 2.2;
        System.out.println(
                "The weight of the person in pound is " + weightInPounds +
                        " and in kg is " + weightInKg
        );


        // Program 3: Swap two numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);


        // Program 4: Find quotient and remainder
        System.out.print("Enter first number: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter second number: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println(
                "The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + dividend + " and " + divisor
        );

        scanner.close();
    }
}

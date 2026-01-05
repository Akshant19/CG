package Control_Flow;
import java.util.*;
public class Level2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 1: Print odd and even numbers from 1 to n
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }


        // Program 2: Calculate employee bonus based on years of service
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }


        // Program 3: Multiplication table from 6 to 9
        System.out.print("Enter a number for multiplication table: ");
        int tableNumber = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }


        // Program 4: FizzBuzz using for loop
        System.out.print("Enter a number for FizzBuzz (for loop): ");
        int fizzBuzzNumber = scanner.nextInt();

        if (fizzBuzzNumber > 0) {
            for (int i = 1; i <= fizzBuzzNumber; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number is not a positive integer");
        }


        // Program 5: FizzBuzz using while loop
        System.out.print("Enter a number for FizzBuzz (while loop): ");
        int fizzBuzzWhile = scanner.nextInt();

        if (fizzBuzzWhile > 0) {
            int i = 1;
            while (i <= fizzBuzzWhile) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number is not a positive integer");
        }

        scanner.close();
    }
}

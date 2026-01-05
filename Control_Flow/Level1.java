package Control_Flow;
import java.util.*;
public class Level1
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 1: Check if a number is divisible by 5
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));


        // Program 2: Check if the first number is the smallest
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        boolean isFirstSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);


        // Program 3: Check which number is the largest
        boolean isFirstLargest = number1 >= number2 && number1 >= number3;
        boolean isSecondLargest = number2 >= number1 && number2 >= number3;
        boolean isThirdLargest = number3 >= number1 && number3 >= number2;

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);


        // Program 4: Check natural number and calculate sum
        System.out.print("Enter a number to check natural number and sum: ");
        int naturalNumber = scanner.nextInt();

        if (naturalNumber >= 0) {
            int sum = naturalNumber * (naturalNumber + 1) / 2;
            System.out.println("The sum of " + naturalNumber + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + naturalNumber + " is not a natural number");
        }


        // Program 5: Check voting eligibility
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        scanner.close();
    }
}

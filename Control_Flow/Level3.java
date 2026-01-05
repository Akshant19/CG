package Control_Flow;
import java.util.*;
public class Level3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 1: Leap Year using multiple if-else
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        } else {
            System.out.println("Year should be 1582 or later");
        }


        // Program 2: Leap Year using single if condition with logical operators
        System.out.print("Enter a year (single if check): ");
        int yearSingleIf = scanner.nextInt();

        if (yearSingleIf >= 1582 && (yearSingleIf % 400 == 0 || (yearSingleIf % 4 == 0 && yearSingleIf % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }


        // Program 3: Calculate percentage, grade, and remarks
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (average >= 40) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }


        // Program 4: Check Prime Number
        System.out.print("Enter a number to check prime: ");
        int primeNumber = scanner.nextInt();

        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is a Prime Number");
        } else {
            System.out.println(primeNumber + " is not a Prime Number");
        }


        // Program 5: Check Armstrong Number
        System.out.print("Enter a number to check Armstrong: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }


        // Program 6: Count number of digits
        System.out.print("Enter a number to count digits: ");
        int digitNumber = scanner.nextInt();

        int count = 0;
        int tempNumber = digitNumber;

        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}

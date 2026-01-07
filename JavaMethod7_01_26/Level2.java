package JavaMethod7_01_26;
import java.util.*;
public class Level2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // Sum of n natural numbers using recursion and formula comparison
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a Natural Number");
        } else {
            int recursiveSum = 0;
            int temp = n;
            while (temp > 0) {
                recursiveSum += temp;
                temp--;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Recursive Sum: " + recursiveSum);
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println(recursiveSum == formulaSum ? "Both results are correct" : "Results are different");
        }

        // Leap Year check using Gregorian calendar rules
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");

        // Unit conversion kilometers to miles
        double km = sc.nextDouble();
        System.out.println(km * 0.621371);

        // Unit conversion miles to kilometers
        double miles = sc.nextDouble();
        System.out.println(miles * 1.60934);

        // Unit conversion meters to feet
        double meters = sc.nextDouble();
        System.out.println(meters * 3.28084);

        // Unit conversion feet to meters
        double feet = sc.nextDouble();
        System.out.println(feet * 0.3048);

        // Unit conversion yards to feet
        double yards = sc.nextDouble();
        System.out.println(yards * 3);

        // Unit conversion feet to yards
        double feetVal = sc.nextDouble();
        System.out.println(feetVal * 0.333333);

        // Unit conversion meters to inches
        double metersVal = sc.nextDouble();
        System.out.println(metersVal * 39.3701);

        // Unit conversion inches to meters
        double inches = sc.nextDouble();
        System.out.println(inches * 0.0254);

        // Unit conversion inches to centimeters
        double inchesCm = sc.nextDouble();
        System.out.println(inchesCm * 2.54);

        // Unit conversion Fahrenheit to Celsius
        double f = sc.nextDouble();
        System.out.println((f - 32) * 5 / 9);

        // Unit conversion Celsius to Fahrenheit
        double c = sc.nextDouble();
        System.out.println((c * 9 / 5) + 32);

        // Unit conversion pounds to kilograms
        double pounds = sc.nextDouble();
        System.out.println(pounds * 0.453592);

        // Unit conversion kilograms to pounds
        double kg = sc.nextDouble();
        System.out.println(kg * 2.20462);

        // Unit conversion gallons to liters
        double gallons = sc.nextDouble();
        System.out.println(gallons * 3.78541);

        // Unit conversion liters to gallons
        double liters = sc.nextDouble();
        System.out.println(liters * 0.264172);

        // Voting eligibility check for 10 students
        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            if (age >= 18)
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}

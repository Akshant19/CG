package JavaMethod7_01_26;
import java.util.*;
public class Level1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Simple Interest calculation
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        // Maximum number of handshakes among N students
        int students = sc.nextInt();
        int handshakes = (students * (students - 1)) / 2;
        System.out.println(handshakes);

        // Number of rounds to complete 5km in triangular park
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = 5000 / perimeter;
        System.out.println(rounds);

        // Check whether number is positive, negative or zero
        int num = sc.nextInt();
        if (num > 0)
            System.out.println(1);
        else if (num < 0)
            System.out.println(-1);
        else
            System.out.println(0);

        // Spring Season check
        int month = sc.nextInt();
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");

        // Sum of n natural numbers using loop
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Find smallest and largest of three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest = a;
        int largest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Smallest: " + smallest + " Largest: " + largest);

        // Find quotient and remainder
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient: " + quotient + " Remainder: " + remainder);

        // Divide chocolates among children
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        System.out.println("Each child gets: " + eachGets + " Remaining chocolates: " + remaining);
    }
    }


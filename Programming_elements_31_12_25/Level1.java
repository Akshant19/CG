package Programming_elements_31_12_25;

import java.util.Scanner;

public class Level1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Kilometer to Miles (Fixed)
        double distanceKm = 10.8;
        double miles = distanceKm / 1.6;
        System.out.println("The distance " + distanceKm + " km in miles is " + miles);

        // 2. Profit and Profit Percentage
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );

        // 3. Pen Distribution
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);

        // 4. Fee Discount (Fixed)
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        // 5. Volume of Earth
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);

        // 6. Kilometer to Miles (User Input)
        System.out.println("Enter distance in km:");
        double kmInput = input.nextDouble();
        double milesOutput = kmInput / 1.6;

        System.out.println("The total miles is " + milesOutput +
                " mile for the given " + kmInput + " km");

        // 7. Fee Discount (User Input)
        System.out.println("Enter fee and discount percent:");
        double inputFee = input.nextDouble();
        double inputDiscountPercent = input.nextDouble();

        double inputDiscount = (inputFee * inputDiscountPercent) / 100;
        double inputFinalFee = inputFee - inputDiscount;

        System.out.println("The discount amount is INR " + inputDiscount +
                " and final discounted fee is INR " + inputFinalFee);

        // 8. Height Conversion
        System.out.println("Enter height in centimeters:");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet + " and inches is " + inches);

        // 9. Basic Calculator
        System.out.println("Enter two numbers:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                number1 + " and " + number2 + " is " +
                (number1 + number2) + ", " +
                (number1 - number2) + ", " +
                (number1 * number2) + ", and " +
                (number1 / number2));

        // 10. Area of Triangle
        System.out.println("Enter base and height:");
        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of triangle in square centimeters is " +
                areaCm + " and square inches is " + areaInches);
    }
}

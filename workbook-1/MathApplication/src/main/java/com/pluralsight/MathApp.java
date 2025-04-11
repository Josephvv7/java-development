package com.pluralsight;

public class MathApp {
    // Question 1:
    // declare variables here
    // then use System.out.println() to display results
    // ex: System.out.println("The answer is " + answer) ;
    // REPEAT FOR NEXT EXERCISE
public static void main(String[] args) {
    //Question 1:
    double bobSalary = 45000.0;
    double garySalary = 60000.0;
    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest salary is " + highestSalary);

    System.out.println("=================");

    // Question 2:
    double carPrice = 50000.0;
    double truckPrice = 120000.0;
    double minPrice = Math.min(carPrice, truckPrice);
    System.out.println("The smallest price is " + minPrice);

    System.out.println("=================");

    // Question 3:
    double radius = 7.25;
    double area = Math.PI * Math.pow(radius, 2);
    System.out.println("The area of the circle is " + area);

    System.out.println("=================");

    // Question 4:
    double num1 = 5.0;
    double sqrtNum1 = Math.sqrt(num1);
    System.out.println("The square root of " + num1 + " is " + sqrtNum1);

    System.out.println("=================");

    // Question 5:
    int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("The distance between the point is: " + distance);

    System.out.println("=================");

    // Question 6:
    double num2 = -3.8;
    double absNum2 = Math.abs(num2);
    System.out.println("The absolute value of " + num2 + " is " + absNum2);

    System.out.println("=================");

    // Question 7:
    double randomNum = Math.random();
    System.out.println("The random number is " + randomNum);

    System.out.println("=================");






}
}

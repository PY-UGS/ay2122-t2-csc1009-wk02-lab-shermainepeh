package CSC1009;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {

        /* Question 1 - compute the area using radius from user input */
        System.out.print("Enter a number for radius: ");
        double radius = checkInputForDouble();
        final double pi = 3.14159;
        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area + "\n");

        /* Question 2 - Average calculation for multiple input from keyboard */
        System.out.print("Enter three numbers: ");
        double num1 = checkInputForDouble();
        double num2 = checkInputForDouble();
        double num3 = checkInputForDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + avg + "\n");

        /* Question 3 - Display the Current Time */
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        String time = currentHour + ":" + currentMinute + ":" + currentSecond ;

        System.out.println("Current time is " + time + " GMT"+ "\n");

        /* Question 4 - Chinese Zodiac Calculation */
        String[] chineseZodiacs = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        System.out.print("Enter a year: ");
        int year = checkInputForInt();
        int month;
        if(year > 0)
        {
            month = year % 12;
            System.out.println(chineseZodiacs[month]);
        }
        else {
            System.out.println("Please enter a valid year.");
        }
    }

    public static double checkInputForDouble() {
        while(true)
        {
            try {
                return userInput.nextDouble();
            } catch (InputMismatchException ex) {
                userInput.next();
                System.out.println("Not a valid number!");
                System.out.println("Please re-enter: ");
            }
        }
    }

    public static int checkInputForInt() {
        while(true)
        {
            try {
                return userInput.nextInt();
            } catch (InputMismatchException ex) {
                userInput.next();
                System.out.println("Not a valid number!");
                System.out.println("Please re-enter: ");
            }
        }
    }
}
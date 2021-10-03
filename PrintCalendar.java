import java.util.Scanner;

/**
 * Write a program that asks the user for the number of days in a month 
 * and the starting day.Write a program that asks the user for the number
 * of days in a month and the starting day.  
 * The program will then print a calendar for the month as follows.
 * Su  M  T  W Th  F Sa
             1  2  3  4
    5  6  7  8  9 10 11
   12 13 14 15 16 17 18
   19 20 21 22 23 24 25
   26 27 28 29 30 31
 */

public class PrintCalendar {

    public static void main(String []args) {
        System.out.println("Problem 1: Print a Calendar");

        // Ignoring resource leak
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many days are there in the month? (28-31)");
        int numberOfDays = keyboard.nextInt();

        String startingDay = keyboard.nextLine();
        System.out.println("What is the starting day? (Su,M,T,W,Th,F,Sa)");
        startingDay = keyboard.nextLine();
        System.out.println();

        // Top line of calendar
        System.out.println("Su   M   T   W  Th   F  Sa");
        int startingDayNum;

        switch (startingDay) {
            case "Su": 
                startingDayNum = 1;
                break;
            case "M": 
                startingDayNum = 2;
                break;
            case "T": 
                startingDayNum = 3;
                break;
            case "W": 
                startingDayNum = 4;
                break;
            case "Th": 
                startingDayNum = 5;
                break;
            case "F": 
                startingDayNum = 6;
                break;
            case "Sa":
                startingDayNum = 7;
                break;
            default: 
                startingDayNum = -1;
                System.out.println("Incorrect input!");
                break;  
        }

        int numSpaces = 1 + startingDayNum*4 - 4;
        for (int i = 0; i < numSpaces;i++) {
            System.out.print(" ");
        }

        for (int j = 1;j < 9 - startingDayNum ;j++) {
            System.out.print(j + "   ");
        }
        System.out.println();

        int dayNum = 9 - startingDayNum;

        for (int k = 0; k < 4;k++) {
            for (int l = 0; l < 7;l++) {
                if (l == 0 && k == 0) {
                    System.out.print(" " + dayNum + "   ");
                    dayNum++;
                } else {
                    if (dayNum > numberOfDays || dayNum > 31) {
                        break;
                    }

                    if (dayNum >= 9) {
                        System.out.print(dayNum + "  ");
                        dayNum++;
                    } else {
                        System.out.print(dayNum + "   ");
                        dayNum++;
                    }
                    
                }
            }
            System.out.println();
        }

        //System.out.println("Number of days: " + numberOfDays);
        //System.out.println("The starting day is: " + startingDay);

    }

}
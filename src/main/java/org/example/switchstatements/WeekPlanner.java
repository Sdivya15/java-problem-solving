package org.example.switchstatements;

import java.util.Scanner;

//A simple Java console app that takes the day as input and
// uses a modern arrow-syntax switch statement with grouped cases, Scanner,
// and trim().toLowerCase() string normalization to print a motivational message accordingly.
public class WeekPlanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = input.nextLine().trim();
        switch(day.toLowerCase()){
            case "monday" -> System.out.println("Focus Day: Work on your Java Projects");


            case "tuesday", "wednesday","thursday" -> System.out.println("Mid-week Grind: Keep going");


            case "friday" -> System.out.println("Release Day: Push your code to GitHub!");


            case "saturday","sunday" -> System.out.println("Relax: It's the weekend!");


            default -> System.out.println("Invalid Day");


        }
        input.close();
    }
}

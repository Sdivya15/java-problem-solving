package org.example.switchstatements;

import java.util.Scanner;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select Mood:");
        String mood = input.nextLine().trim();


        int brightness;
        String color = "black";
        String music = "No music";
        switch (mood.toLowerCase()){//Case-insensitive mood selection

            //Uses modern switch (arrow syntax) which prevents "Fall-through" bugs (where the code accidentally runs the next case).
            // "Study": Set Brightness to 100%, Color to White, Music to Lo-fi Beats.
            case "study" -> {
                brightness = 100;
                color = "white";
                music = "Lo-fi Music";
            }
            //"Movie": Set Brightness to 10%, Color to Blue, Music to Cinematic Surround.
            case "movie" -> {
                brightness = 10;
                color = "Blue";
                music = "Cinematic surround";
            }
            //"Party": Set Brightness to 80%, Color to Multicolor, Music to Dance Mix.
            case "party" -> {
                brightness = 80;
                color = "Multicolor";
                music = "Dance Mix";
            }
            //"Sleep": Set Brightness to 0%, Color to None, Music to White Noise.
            case "sleep" -> {
                brightness = 0;
                color = "None";
                music = "White Noise";
            }
            //Default: Print "Invalid Mood! Resetting to Standard Mode (50% Brightness)."
            default -> {//Default reset mode for invalid input
                brightness = 50;
                System.out.println("Invalid Mood! Resetting to Standard Mode");
            }
        }
        System.out.println("Setting Brightness to "+ brightness);
        System.out.println("Setting Color to "+ color);
        System.out.println("Setting Music to "+ music);

    }
}

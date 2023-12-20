package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
            getOutput(getResult(getData()));
        } catch (Exception e) {
            getOutput("Exception: " + e.getMessage());
        }
    }

    private static Lights getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the colour of the traffic light: ");
        return Lights.valueOf(sc.nextLine().trim().toUpperCase());
    }

    private static String getResult(Lights colour) {
        return switch (colour) {
            case RED -> "Stop";
            case YELLOW -> "Get ready";
            case GREEN -> "Go";
        };
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

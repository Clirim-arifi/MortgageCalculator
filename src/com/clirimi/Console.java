package com.clirimi;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double lexesi(String prompt) {
        return scanner.nextDouble();
    }

    public static double lexesi(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Jepe nje vlere ne mes " + min + " dhe " + max);
        }
        return value;
    }
}


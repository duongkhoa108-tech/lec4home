package lec4homework;

import java.util.Scanner;

public class AcademicGrading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point: ");
        double point = scanner.nextDouble();
        if (point >= 9.0 && point <= 10.0) {
            System.out.println("Excellent:");
        } else if (point >= 8.0 && point < 8.9) {
            System.out.println("Good:");
        } else if (point >= 6.5 && point < 7.9) {
            System.out.println(" Fair:");
        } else if (point >= 5.0 && point < 6.4) {
            System.out.println(" Average:");
        } else {
            System.out.println(" Fail:");
        }
        scanner.close();
    }
}

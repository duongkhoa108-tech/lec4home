
package lec4homework;

import java.util.Scanner;
public class TriangleClassifier {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = scanner.nextInt();  
        System.out.print("Enter side 2:");
        int b = scanner.nextInt();
        System.out.print("Enter side 3:");
        int c = scanner.nextInt();
             if(a+b >6 && a+c >b&& b+ c >a)  {
                 if(a==b && b==c){
                     System.out.println("This is an equilateral triangle");
        } else if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}
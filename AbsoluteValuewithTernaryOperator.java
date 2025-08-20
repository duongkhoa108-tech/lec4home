
package lec4homework;
import java.util.Scanner;
public class AbsoluteValuewithTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int abs = (number >= 0) ? number : -number;

        System.out.println("The absolute value is " + abs);
    }       
}

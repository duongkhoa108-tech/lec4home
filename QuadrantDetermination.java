
package lec4homework;
import java.util.Scanner;
public class QuadrantDetermination {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate:");
        double y = scanner.nextDouble();
        if(x >0 && y >0){
            System.out.println("The point is in the 1st quadrant.");
            
        }else if(x < 0 && y < 0){
             System.out.println("The point is in the 2nd quadrant."); 
        }else if(x < 0 && y < 0){
             System.out.println("The point is in the 3rd quadrant."); 
        }else if(x > 0 && y < 0){
              System.out.println("The point is in the 4th quadrant.");
        }else if (x == 0 && y == 0){
            System.out.println("The point is at the origin.");
        }else{
            System.out.println("The point is on an axis.");
        
       }
       scanner.close();
    }
   }
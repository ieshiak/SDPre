import java.util.Scanner;
public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter a number: ");
      int num1 = keyboard.nextInt();

    if(num1 > 0) {
      System.out.println("The number is positive");
    }
    if(num1 < 0) {
      System.out.println("The number is negative");
    }
    if(num1 == 0) {
      System.out.println("The number equals to 0");
    }
    
  }
}
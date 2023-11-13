import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int selection;

    while(true){

      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = input.nextInt();

    if(selection == 1){
      System.out.println("Hello Human");
      System.out.println();
     }
      
    if(selection == 2){
      System.out.println("Apples, Bananas, Coconuts");
      System.out.println();
      }

    if(selection == 3)
      System.out.println("Goodbye");
      break;
    }

    input.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();

  }
}
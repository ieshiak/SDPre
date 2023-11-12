public class Objective5Lab3 {
    public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
      int userNum = input.nextInt;

    if(userNum > 0) {
      System.out.println("The number is positive");
    }
    if(userNum < 0) {
      System.out.println("The number is negative");
    }
    if(userNum == 0) {
      System.out.println("The number equals to 0");
    }

    Scanner.close();
  
  }
}
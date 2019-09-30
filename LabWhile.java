import java.util.Scanner;

public class LabWhile{

   public static void main(String[] args){
      multiplyNumbers();
   }
   
   public static void multiplyNumbers(){
      int product = 1;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number to multiply(press 0 to quit): ");
      int number = input.nextInt();
      
      while(number != 0){
      
         System.out.printf("%nProduct: %d", number * product);
      }
   }


}
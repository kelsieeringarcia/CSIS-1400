import java.util.Scanner;

public class LabVariablesScanner {

   public static void main(String[] args) {
      //creating a new instance of scanner.
      Scanner input = new Scanner(System.in);
      
      
      System.out.print("Favorite destination?");
      //taking user input for the destination variable
      String destination = input.nextLine();
      
      
      //taking the destination variable and putting in a sentence and next line
      System.out.printf("Welcome to %s%n%n", destination);
      
      int kingsPeak = 4124;
      
      int timpanogos = 3581;
      
      System.out.printf("Elevation of Kings Peak: %d%n", kingsPeak);
      
      System.out.printf("Elevation of Timpanogos: %d", timpanogos);
      
   
   }
   
}
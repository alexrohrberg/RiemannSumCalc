import java.util.Scanner;

public class RiemannSumMain{
   public static void main(String[] args) {
          
      System.out.println("Welcome to the Simple Reimann Sum Calculator!"
      + "\n\nPlease begin by entering the starting and ending values for x and press Enter");
      
      System.out.println("Please use decimal values!");
      
      RiemannSum test = new RiemannSum();
      Scanner scan = new Scanner(System.in);
      test.setStartX(scan.nextDouble());         
                  
      System.out.println("Now please enter the final endpoint value for x and press Enter");
      test.setEndX(scan.nextDouble());
          
      System.out.println("Finally, enter the value of n.");
      test.setN(scan.nextDouble());
      
      test.calculateDelta(test.getN());
      
      System.out.println("Now would you like to calculate the sum using Left, Middle, or Right endpoints?");
      System.out.println("Enter L, M, or R");
      
      char c = scan.next().charAt(0);
      scan.close();
      
      System.out.println("Great! The resulting Reimann Sum is ");
      
      if (c == 'L'){
         test.calculateLSum();
      }
      else if(c == 'M'){
         test.calculateMSum();
      }
      else if(c == 'R'){
         test.calculateRSum();
      }
        
   }
}
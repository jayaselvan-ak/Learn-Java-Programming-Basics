import java.util.*;
public class PrecedenceOrderOfLogicalOperators02{

   public static void main(String[] args) {

      int X,Y,A,B,heartRate;
      Scanner input= new Scanner(System.in);
      X=input.nextInt();
      Y=input.nextInt();
      A=input.nextInt();
      B=input.nextInt();
      heartRate=input.nextInt();
      
      boolean result1 = (X + Y) > 30;
      boolean result2 = A > 3 || B < 6;
      boolean result3 = heartRate == 70;
      boolean result = result1 && result2 && result3;
      
      System.out.println("The statement said by the person is " + result);
 
   }
}

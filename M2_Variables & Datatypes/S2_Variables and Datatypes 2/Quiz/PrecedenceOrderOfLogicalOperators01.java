import java.util.*;
public class PrecedenceOrderOfLogicalOperators01{

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       int y = input.nextInt();
       boolean result = (x+y) > 30;
       System.out.println("The statement said by the person is "+result);
        }
}

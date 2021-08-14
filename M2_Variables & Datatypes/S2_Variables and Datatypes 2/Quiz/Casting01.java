import java.util.*;
public class Casting01{

   public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int a=input.nextInt();
       float f=input.nextFloat();
       double d=input.nextDouble();
       
       System.out.print("x=" + (float) a);
       System.out.print(" y="+(int) f);
       System.out.println(" z="+(float) d);
   }
}

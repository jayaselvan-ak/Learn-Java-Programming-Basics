import java.util.*;
public class DoWhileloop02{

   public static void main(String[] args) {
       int n;
       Scanner input= new Scanner(System.in);
       n=input.nextInt();
       int i =0;
       do{
           i++;
           n=n/10;
       }while (n!=0);
       System.out.println(i);
         }
}

import java.util.*;
public class WhileLoopExamples03{

   public static void main(String[] args) {
     int x,n;
     Scanner input= new Scanner(System.in);
     x=input.nextInt();
     n=input.nextInt();
     
     int i=1;
     while(i<=n){
         System.out.println(x*i);
         i ++;
     }
 
   }
}

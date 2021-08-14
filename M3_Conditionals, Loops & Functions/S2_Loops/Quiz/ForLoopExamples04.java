import java.util.*;
public class ForLoopExamples04{

   public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       int sum =0;
       
       for(int i=0; i<n; i++){
           int temp = input.nextInt();
           sum=sum+temp;
       }
       
       System.out.println(sum/n);
     
   }
}

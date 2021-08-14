import java.util.*;
public class PracticeQuestions02{

   public static void main(String[] args) {

       int length,breadth;
       Scanner input = new Scanner(System.in);
       length=input.nextInt();
       breadth=input.nextInt();
       
       if(breadth == length){
           System.out.println("Square");
       }
       else{
           System.out.println("Rectangle");
       }
   }
}

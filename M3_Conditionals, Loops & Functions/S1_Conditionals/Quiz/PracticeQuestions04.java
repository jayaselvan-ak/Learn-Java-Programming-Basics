import java.util.*;
public class PracticeQuestions04{

   public static void main(String[] args) {

       int age, vote;
       Scanner input= new Scanner(System.in);
       age=input.nextInt();
       vote=input.nextInt();
       
       if(age>=18){
           switch (vote){
               case 1:
                   System.out.println("You have voted for Ram");
                   break;
                case 2:
                   System.out.println("You have voted for Shyam");
                   break;
                case 3:
                   System.out.println("You have voted for Ghanshyam");
                   break;
                default:
                   break;
           }
       }
       else{
           System.out.println("You are not eligible");
       }
   }
       }
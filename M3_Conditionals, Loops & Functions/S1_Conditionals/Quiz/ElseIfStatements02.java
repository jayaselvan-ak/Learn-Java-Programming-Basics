import java.util.*;
public class ElseIfStatements02{

   public static void main(String[] args) {

       String name;
       int marks;
       Scanner input = new Scanner(System.in);
       name = input.nextLine();
       marks = input.nextInt();
       char grade;
       
       if(marks<=40){
           grade = 'E';
       }
       else if(marks<=60){
           grade = 'D';
       }
       else if(marks<=80){
           grade = 'C';
       }
       else if(marks<=100){
           grade = 'B';
       }
       else{
           grade = 'A';
       }
       
       System.out.println("The grade scored by "+name+" is "+grade);
   }
}

import java.util.*;
public class ConditionalStatementsAndIfElse01{

   public static void main(String[] args) {

    int n;
    Scanner input= new Scanner(System.in);
    n=input.nextInt();
  //write your code here to determine is n is an even or odd number
  if(n>0){
      System.out.println("The number entered is positive");
  }
  else{
      System.out.println("The number entered is negative");
  }
}
}

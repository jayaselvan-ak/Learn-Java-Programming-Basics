import java.util.*;
class PracticeQuestions104{
  public static void main(String[] args) {
    int myAge;
    int ageOfBrother;
    //Write your code here
    Scanner input = new Scanner(System.in);
    myAge = input.nextInt();
    ageOfBrother = input.nextInt();
    
    boolean result = (myAge > 0) && (ageOfBrother > 0) && (ageOfBrother + myAge < 25);
    
    System.out.println(result);
  }
}

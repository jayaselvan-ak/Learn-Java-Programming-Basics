import java.util.Scanner;

class ForLoopExamples02{
  public static void main(String arg[]) {
    Scanner scan = new Scanner(System.in);
    //Enter the number upto which you wish to find the sum, in the input console
    int number = scan.nextInt();
    int sum = 0;

    // for ( /* define for-loop here */  ) {
    //   // Write your logic here
      
    // }
    sum = (number * (number +1))/2;
    
    System.out.print(sum);
  }
}

import java.util.Scanner;

class PracticeQuestions02{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Enter the number
    int number = scan.nextInt();  
    int result = 1;
    if(number >= 2) {
        int i=number;
        while (i>2) {
          // Write the logic
          int j=i;
          int count = 0;
          while(j>1){
              if(j%2==0){
                  j=j/2;
                  count ++;
                  //System.out.println(j+ " "+i);
              }
              else{
                  break;
              }
          }
          if(j==1 && count > 0){
              result = i;
              break;
          }
          i --;
        }
    
        System.out.print(result);
    
    } else {
      System.out.print("Please enter an integer >= 2");   
    }
    scan.close();
  }
}

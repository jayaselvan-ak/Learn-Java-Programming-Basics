import java.util.Scanner;

class PracticeQuestions01{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);        
    // Enter number 1 in the Input Console
    int num1 = scan.nextInt();
    // Enter number 2 in the Input Console
    int num2 = scan.nextInt();
    
    int hcf=1;    
    // Write logic
    if(num1==num2){
        hcf =num1;
    }
    else if(num1>num2){
        for(int i=num2; i>0;i--){
            if(num1%i==0 && num2%i==0){
                hcf=i;
                break;
            }
        }
    }
    else{
        for(int i=num1; i>0;i--){
            if(num1%i==0 && num2%i==0){
                hcf=i;
                break;
            }
        }
    }
        
    System.out.print(hcf);
    scan.close();
  }
}

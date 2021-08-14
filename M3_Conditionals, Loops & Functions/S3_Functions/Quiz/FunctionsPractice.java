import java.util.Scanner;

class FunctionsPractice{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }
    
    // Write the LCM function here
    public static int lcm(int n1, int n2){
        int hcf = hcf_cal(n1, n2);
        int lcm = hcf * (n1/hcf) * (n2/hcf);
        return lcm;
    }
    
    public static int hcf_cal(int num1, int num2){
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
        return hcf;
    }
 
}

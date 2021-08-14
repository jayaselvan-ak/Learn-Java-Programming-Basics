import java.util.Scanner;
class PracticeQuestions06{
    
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        // Write your logic here
        if(age<60){
            if(income<250000){
                tax = 0.0;
            }
            else if(income<300000){
                tax = (income - 250000) * 0.1;
            }
            else if(income<500000){
                tax = ((income - 300000) * 0.1) + ((300000 - 250000) * 0.1);
            }
            else if(income<1000000){
                tax = ((income - 500000) * 0.2) + ((300000 - 250000) * 0.1)+ ((500000 - 300000) * 0.1);
            }
            else{
                tax = ((income - 1000000) * 0.3) + ((300000 - 250000) * 0.1)+ ((500000 - 300000) * 0.1) +((1000000 - 500000) * 0.2);
            }
        }
        else if(age<80){
            if(income<250000){
                tax = 0.0;
            }
            else if(income<300000){
                tax = 0.0;
            }
            else if(income<500000){
                tax = (income - 300000) * 0.1;
            }
            else if(income<1000000){
                tax = ((income - 500000) * 0.2) + ((500000 - 300000) * 0.1);
            }
            else{
                tax = ((income - 1000000) * 0.3) + ((500000 - 300000) * 0.1) +((1000000 - 500000) * 0.2);
            }
        }else{
            if(income<250000){
                tax = 0.0;
            }
            else if(income<300000){
                tax = 0.0;
            }
            else if(income<500000){
                tax = 0.0;
            }
            else if(income<1000000){
                tax = ((income - 500000) * 0.2) ;
            }
            else{
                tax = ((income - 1000000) * 0.3) + ((1000000 - 500000) * 0.2);
            }
        }
        System.out.print(tax);
        scan.close();
    }
}

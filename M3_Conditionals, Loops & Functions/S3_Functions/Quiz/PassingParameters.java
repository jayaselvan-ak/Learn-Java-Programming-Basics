import java.util.Scanner;

class PassingParameters{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
    }
    
    // Write the function squareOfSum here
    public static int squareOfSum(int n1, int n2){
        return (n1+n2) * (n1+n2);
    }
}

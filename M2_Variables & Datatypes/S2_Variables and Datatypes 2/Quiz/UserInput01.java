import java.util.Scanner;
class UserInput01{
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    //Write your code here
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    //You can import the scanner class as discussed in the videos
    System.out.println(a*b+c);
  }
}

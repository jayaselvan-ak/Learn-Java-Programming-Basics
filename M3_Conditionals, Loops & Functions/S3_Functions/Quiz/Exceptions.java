import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Source {
   public static void main(String[] args) throws java.io.IOException{
      // Enter a string in the input console
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

       String inData;
       inData = stdin.readLine();

       System.out.println("You wrote: " + inData);

   }
}

class WhileLoopExamples01{
    public static void main(String[] args) {
        int num = 25;
        while(num>0) {
          System.out.print (num + " ");
          // write decrement/increment condition here
          if(num%2==1){
              num = num -2;
          }
          else{
              num --;
          }
        }
    }
}

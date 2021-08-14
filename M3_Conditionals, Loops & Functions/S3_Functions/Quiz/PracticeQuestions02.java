class PracticeQuestions02{
  public static void main(String args[]) {
    int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
    int userWithMostVotes = mostVotes(votes);
    System.out.println("User with the most votes is User: " + userWithMostVotes);  
    }
    
    // write the function mostVotes() here.
    public static int mostVotes(int[] votes){
        int max = votes[0];
        int ind = 0;
        for(int i=1;i<votes.length;i++){
            if(max<votes[i]){
                max = votes[i];
                ind = i;
            }
        }
        return ind;
    }
}

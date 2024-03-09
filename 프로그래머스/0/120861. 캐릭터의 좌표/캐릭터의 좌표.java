class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
       int temp1 = 0;
        int temp2 = 0;
        
        for(int i=0; i<keyinput.length;i++){
           if(keyinput[i].equals("left")){
               if((board[0]-1)/2>-temp1){
               temp1--;}
           }else if(keyinput[i].equals("right")){
              if((board[0]-1)/2>temp1){
               temp1++;
              }
           }else if(keyinput[i].equals("up")){
               if((board[1]-1)/2>temp2){
               temp2++;}
           }else if(keyinput[i].equals("down")){
               if((board[1]-1)/2>-temp2){
                temp2--;}
            }
        }
      
        answer[0] = temp1;
        answer[1] = temp2;
        return answer;
    }
}
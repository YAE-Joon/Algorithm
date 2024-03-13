import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count =0;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
      
        int[] answer = new int[count];
        count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[count]=arr[i];
                count++;
            }
        }
        Arrays.sort(answer);
        if(answer.length==0){
            answer= new int[1];
            answer[0]=-1;
        }
        return answer;
    }
}
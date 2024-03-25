import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int count=1;
        
        
        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        
        int[] answer = new int[count];
        count=1;
        answer[0]= arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
               
                answer[count] =arr[i];
            count++;
            }
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        return answer;
    }
}
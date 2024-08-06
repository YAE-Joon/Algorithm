import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    Deque<Integer> order = new ArrayDeque<>();
    
        for(int i=0; i<arr.length;i++){
            if(i==0){
                order.offer(arr[i]);
            }else if(order.peekLast()!=arr[i]){
                order.offer(arr[i]);
                
            }
        }
        int[] answer = new int[order.size()];
        for(int i=0; i<answer.length;i++){
            answer[i]=order.poll();
        
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> finProgress = new ArrayDeque<>();
        
        for(int i=0;i<progresses.length;i++){
            int percent = 100 - progresses[i];
            int speed = speeds[i];
            if(percent%speed!=0){
                finProgress.offer((percent/speed)+1);
            }else{
                finProgress.offer(percent/speed);
            }
        }
        int count =0;
        int num = 0;
        while(finProgress.peek()!=null){
            num = finProgress.poll();
            count = 1;
            while(finProgress.peek()!=null&&num>=finProgress.peek()){
                finProgress.poll();
                count++;
            }
            result.add(count);
        }
        int[] answer = new int[result.size()];
        for(int i =0; i<result.size();i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
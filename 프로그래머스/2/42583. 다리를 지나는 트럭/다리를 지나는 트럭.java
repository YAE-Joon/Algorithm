import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWei = 0;
        int truckNum = 0;
        Queue<Integer> bridge = new ArrayDeque<>(); 
        
        for(int i=0; i<bridge_length;i++){
            bridge.offer(0);
        }
        
        while(truckNum!=truck_weights.length){
            answer++;
        
            int in = truck_weights[truckNum];
            int out = bridge.poll();
        
            totalWei = totalWei + in - out;
            
            if(totalWei>weight){
                totalWei = totalWei - in; 
                bridge.offer(0);
                
            }else{
                bridge.offer(in);
                truckNum++;
            }
            
            
        }
        
        answer = answer + bridge_length;
        
        
        return answer;
    }
}
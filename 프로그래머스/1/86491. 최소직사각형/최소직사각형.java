import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        
        for(int i=0; i<sizes.length;i++){
        if(sizes[i][0]>sizes[i][1]){
            max[i] = sizes[i][0];
            min[i] = sizes[i][1];
        }else{
            min[i] = sizes[i][0];
            max[i] = sizes[i][1];
        }
        
        }
    
        Arrays.sort(max);
        Arrays.sort(min);
        
        return max[max.length-1]*min[min.length-1];    
    }
}
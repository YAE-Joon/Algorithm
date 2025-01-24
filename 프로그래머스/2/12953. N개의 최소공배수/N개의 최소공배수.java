import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);
        
        int max = arr[arr.length-1];
        boolean check = true;
        
        for(int i=2;i<=max;i++){
            
            if(!check){
            check = true;
            i=i-1;
            }
            
            for(int n = 0; n<arr.length;n++){
                if(arr[n]%i==0){
                    if(check){
                        answer *= i;
                        System.out.println("i ="+i+"ans="+answer);
                        check = false;        
                    }
                arr[n] =arr[n]/i;
                System.out.println("after = "+Arrays.toString(arr));
                }
            }
       
        }
            
        

        for(int i =0; i<arr.length;i++){
            answer *= arr[i];
        }
        return answer;
    }
}
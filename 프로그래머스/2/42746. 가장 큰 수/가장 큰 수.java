import java.util.*;
class Solution {
    public String solution(int[] numbers) {
       
        StringBuilder sb = new StringBuilder();
          Integer[] numbers2 = new Integer[numbers.length];
      for(int i =0; i<numbers.length;i++){
        numbers2[i] = numbers[i];
      }
        Arrays.sort(numbers2,new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                String temp1 = o1+"";
                String temp2 = o2+"";
                
                String temp3 = temp1+temp2;
                String temp4 = temp2+temp1;
                return temp3.compareTo(temp4);
            }
        });
        
        for(int i=numbers.length-1; i>=0;i--){
          sb.append(numbers2[i]);
        
        }
            if(sb.charAt(0)=='0'){
                return "0";
            }
        
        return sb.toString();
        }
    
            
    }
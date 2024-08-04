import java.util.*;
class Solution {
    public String solution(int[] numbers) {
       
        StringBuilder sb = new StringBuilder();
          Integer[] numbers2 = new Integer[numbers.length];
      for(int i =0; i<numbers.length;i++){
        numbers2[i] = numbers[i];
      }
        Arrays.sort(numbers2,new BigNumComparator());
        
        for(int i=numbers.length-1; i>=0;i--){
          sb.append(numbers2[i]);
        
        }
        for(int i=0; i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                return sb.toString();
            }
        }
        return "0";
        }
    
    static class BigNumComparator implements Comparator<Integer>{
        
        public int compare(Integer o1, Integer o2){
            String temp1 = String.valueOf(o1);
            String temp2 = String.valueOf(o2);
            int order =0;
            while (temp1.length()<4){
                temp1 += temp1.charAt(order);
                order++;
            }
            order=0;
            while (temp2.length()<4){
                temp2 += temp2.charAt(order);
                order++;
            }
             if(Integer.parseInt(temp1)<Integer.parseInt(temp2)){
                return -1;
             }else if(temp1.equals(temp2)&&o1<o2){
            
                return -1;
             }else if(temp1.equals(temp2)&&o1>=o2){
                 return 0;
             }else{return 1;}
            
            
        }
        
    }
     
    
}
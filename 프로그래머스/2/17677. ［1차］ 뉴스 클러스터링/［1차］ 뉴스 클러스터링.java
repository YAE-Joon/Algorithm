import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        
        
        List<String> a = strArr(str1);
        List<String> b = strArr(str2);
         
        int common = 0;
        //합집합 교집합 찾기
        
        for(int i=0; i<a.size();i++){
            
            String target =a.get(i);
            if(b.contains(target)){ 
                b.remove(target);
                common++;
            }    
        
        }
        
        int sum = a.size()+b.size();
        if(sum ==0){
            sum++;
            common++;
        }
        
        
        answer = common*65536/sum;
        
        return answer;
    }
    
    
    
    public List<String> strArr(String o3){
        List<String> arr = new ArrayList<>();
        
        for(int i=0;i<o3.length()-1;i++){
            
            o3 = o3.toLowerCase();
           String temp = o3.substring(i,i+2);
                
            if(temp.matches("^[a-z]*$")){
               arr.add(temp); 
            }
            
        }
        
        
        
        return arr;
        
    }
}
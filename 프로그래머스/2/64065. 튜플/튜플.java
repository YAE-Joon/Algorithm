import java.util.*;
class Solution {
    public int[] solution(String s) {
        //첫 {1} 숫자를 기억하고, 그다음 {1,2} 을 찾고 .... 계속 가야함.
        
        //일단 s를 배열로 나눠야함. 
        
        // 배열에 담는다.}, 를 기준으로 list에 넣음
        s= s.replace("{{","");
        s= s.replace("}}","");
        String[] arr1 = s.split("\\},\\{");
        
        Map<Integer,String[]> temp = new HashMap<>();
        for(int i=0; i<arr1.length;i++){
            
            String[] arr2 = arr1[i].split(",");
            
            temp.put(arr2.length,arr2);
        
        }
        
        //Map 정리부터
         int[] answer = new int[temp.size()];
        answer[0] = Integer.parseInt(temp.get(1)[0]);
        for(int i=temp.size(); i>1;i--){
              
            String[] order = temp.get(i);
            String[] beforeOrder = temp.get(i-1);
            List<String> compare = Arrays.asList(beforeOrder);
            for(int l=0; l<order.length;l++){
                
                if(!compare.contains(order[l])){
                    answer[i-1] = Integer.parseInt(order[l]);
                }
                
                
            }
            
        }
        
        return answer;
    }
}
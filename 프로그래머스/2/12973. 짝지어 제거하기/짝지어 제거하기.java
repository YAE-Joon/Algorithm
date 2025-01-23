import java.util.*;
class Solution
{
    public int solution(String s)
    {
        
        Deque<Character> deleteDouble = new ArrayDeque<>();
        deleteDouble.offer('1');
        for(int i=0; i<s.length();i++){
            
            if(deleteDouble.peekLast()==s.charAt(i)){
                deleteDouble.pollLast();
            
            }else{
            deleteDouble.offerLast(s.charAt(i));
            }
        }  
        
        if(deleteDouble.pollLast()=='1'){
            return 1;
            }
        else{
            return 0;
        }
        
    }
    
    
}
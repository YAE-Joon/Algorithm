import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Deque<Character> deq = new ArrayDeque<>();
        for(int i=0; i<s.length();i++){
            deq.offerLast(s.charAt(i));
            
        }
        
        for(int i=0; i<deq.size();i++){
        
            Deque<Character> deq1 = new ArrayDeque<>(deq);
            
            if(correct(deq1)){
                
                answer++;
            }
            
            
            Character l =deq.pollFirst();
            deq.offerLast(l);
            
        }
        //괄호를 회전시키는 메서드
        
        
        return answer;
    }
    
    
    //올바른 괄호를 판단하는 메서드 
    public boolean correct(Deque<Character> quest){
        int check = 0;
        int count = 1;
        int size = quest.size();
        
        Deque<Character> extraDeque = new ArrayDeque<>();
        
        
        Character i = quest.pollFirst();
            
        check +=  checkingChar(i);
        
        extraDeque.offerLast(i);
            
        
        while(!quest.isEmpty()){
            
            //} 가 먼저 나오면 종료
            if(check<0){
                break;
            }
            
            //stack이 비어있으면 종료
            if(quest.isEmpty())
                break;
            
            
            Character l = quest.pollFirst();
            
            check += checkingChar(l);
            
            i = extraDeque.pollLast();
            //괄호 합체
            String m = Character.toString(i)+Character.toString(l);
            
            if((m.equals("{}")||m.equals("()")||m.equals("[]"))&&!quest.isEmpty()){
                
                //괄호가 합체되면 새로 뽑음 
                
                if(extraDeque.isEmpty()){
                    
                    
                
                i= quest.pollFirst();
                extraDeque.offerLast(i);
                //
                check += checkingChar(i);
                }
                
            }else if((m.equals("{}")||m.equals("()")||m.equals("[]"))&&quest.isEmpty()){
               //괄호가 합체되고 비어있으면 종료
                
                break;
            }else{
                
                //괄호가 다르면 다른 스택에 추가
                extraDeque.offerLast(i);
                extraDeque.offerLast(l);           
            
            }
        }
        
        
        if(quest.isEmpty()&&check==0&&extraDeque.isEmpty()){
        return true;
        }
        return false;
        
    }
         public int checkingChar(Character t){
            
             if(t=='{'||t=='['||t=='('){
                 return 1;    
                }else{
                 return -1;
                }  
        }
        
        
        
        
    
    
    
    
}
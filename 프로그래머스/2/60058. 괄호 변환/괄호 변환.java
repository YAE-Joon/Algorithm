class Solution {
    
    static String beforeV = "";
    public String solution(String p) {
        String answer = "";
        
        //1. p = u + v
        
          // u는 최초의 균형잡힌 괄호, v도 균형잡힌 괄호
        
        //2. 분리하기 전에 u가 올바른지 확인
        
            //2-1.올바른 문자인 경우 다음 단계
        
            //2-2.올바르지 않을 경우 
        
        //3. v = u + v1 으로 또 분리 마지막으로 분리된 v 가 무엇인지 확인해야됨
        
        //4. 반환된 vn문자열 --> u의 앞뒤 문자 뒤집기. 
        
        
            answer = rightUV(p);
        
        
        
        return answer;
    }
    
    
    String rightUV(String a){
        
        boolean right = true;
        String u ="";
        String v ="";
        String result = "";
        
        int temp =0;
        
        for(int i=0;i<a.length();i++){
            
            if(a.charAt(i)==')'){
                
                temp--;
            }else if(a.charAt(i)=='('){
                
                temp++;
            }
            
                u +=a.charAt(i);
            
            if(temp==0){
                
                v = a.substring(i+1);
                break;
            }else if(temp<0){
                right = false;
            }
        
        
        }
        
        
        
        if(right){
            
            if(v.equals("")){
                return u;
            }
            
            
            beforeV = rightUV(v);
            
            result = u+beforeV;
        }else{
            
            beforeV = rightUV(v);
            result = "("+beforeV+")";
            
            for(int i=1;i<u.length()-1;i++){
                
                 if(u.charAt(i)==')'){
                
                    result += "(";
            }else if(u.charAt(i)=='('){
                
                     
                    result += ")";
            }
                
            }
        }
        
        beforeV = result;
        
        
        
        return result;
        
    }
    
    
    
    
}
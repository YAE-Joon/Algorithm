class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int min = words.length+1;
     
        for(int i=1;i<words.length;i++){
           
            if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)&&min>i+1){
                    min =i+1; break;
                }   
            
            for(int l=0; l<i;l++){
                if(words[i].equals(words[l])&&min>i+1){
                    min=i+1; break;
                }
            }
        }
        System.out.println(min);
           int a = 0;
            int b = 0;
            if(min==words.length+1){
                a=0;b=0;
            }else{  
                if(min%n==0){
                    a = min/n;
                    b = n;
                }else {
                    a = min/n+1;
                    b= min%n;
                }
             } 
        answer[0] =b;
        answer[1] =a;
        
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 

        return answer;
    }
}
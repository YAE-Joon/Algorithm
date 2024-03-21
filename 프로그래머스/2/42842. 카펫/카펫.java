class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x= (brown-4)/2;
     
         int y= x*x-4*yellow;
        for(int i=0;i<brown;i++){
            if(y==i*i){
                y=i;
           break;
            }
        }
       System.out.println(x);
        System.out.println(y);
         answer[0]= (x+y)/2+2;
            answer[1]= (x-y)/2+2;
        
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        String temp = Long.toString(n);
        String[] result = temp.split("");
        int[] answer = new int[result.length];
        int m=0;
        for(int i = result.length-1; i>=0;i--){
            
            answer[i]=Integer.parseInt(result[m]);
                m++;
        }
        return answer;
    }
}
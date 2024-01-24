class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a)+Integer.toString(b);
        int d = Integer.parseInt(c);
        if(d > 2*a*b){ answer = d;}
        else{ answer = 2*a*b;}
        return answer;
    }
}
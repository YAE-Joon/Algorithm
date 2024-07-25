class Solution {
    public String solution(String s) {
        String[] list = s.split(" ");
        int max = Integer.parseInt(list[0]);
        int min = Integer.parseInt(list[0]);;
        for(int i = 0; i<list.length;i++){
            int value = Integer.parseInt(list[i]);
            if(max<value){
                max = value;
            }
            if(min>value){
                min = value;
            }
        }
        String answer = min+" "+max;
        return answer;
    }
}
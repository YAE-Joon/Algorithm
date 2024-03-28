class Solution {
    boolean solution(String s) {
        boolean answer = true;
    String[] a = s.split("");
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i].equals("(")){
                count++;
            }else if(a[i].equals(")")){
                count--;
            }
        if(count<0){
            answer =false;
            break;
        }
        }
        
        if(count!=0){
            answer =false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
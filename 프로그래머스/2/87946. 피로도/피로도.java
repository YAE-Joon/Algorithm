
import java.util.*;

class Solution {

 
    public int solution(int k, int[][] dungeons) {
      int answer = -1;
      List<Integer[]> list = new ArrayList<>();

      List<Integer> answerList = new ArrayList<>();
      for(int[] a :dungeons){
        Integer[] b = new Integer[2];
        b[0] =a[0];
        b[1] =a[1];
        list.add(b);
      }
      adventure(0,list,k,answerList);
      for(int max : answerList){
        if(max>answer){
          answer = max;
        }
      }
      return answer;
    }

    public void adventure(int answer, List<Integer[]> list, int k,List<Integer> answerlist){

      for(int i =0 ; i<list.size(); i++){
       int answer1 = answer;
        if(list.get(i)[0]<=k){
          int p = k - list.get(i)[1];
          List<Integer[]> newList = new ArrayList<>(list);
          newList.remove(list.get(i));
          answer1++;

          adventure(answer1,newList,p,answerlist);

        }

      }
      answerlist.add(answer);
    }
  }

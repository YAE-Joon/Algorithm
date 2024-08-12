import java.util.*;
class Solution {

  public static void main(String[] args){
    Solution solution = new Solution();
    int solution1 = solution.solution("123223");
  }

    public int solution(String numbers) {
      int answer = 0;
      List<String> find = new ArrayList<>();
      String[] number = numbers.split("");
      find.add("");
      for(String a : number ){
        find = result(find,a);
      }
      find.remove("");
      Set<Integer> last = new HashSet<>();


      for(String a : find){
        int b = Integer.parseInt(a);
        last.add(b);
      }


      last.remove(0);
      last.remove(1);

      for(int i : last){
        if(i ==2){
          answer++;
        }else{
          for(int l=2 ; l<i;l++){
            if(i%l==0){
              break;
            }
            if(l==i-1){
                answer++;
            }
          }
        }
      }


      return answer;
    }

    public List<String> result(List<String> o1, String b){

      List<String> newArr = new ArrayList<>(o1);
      for (String c : o1) {
        String a = c + b;
        for(int i=1; i<c.length();i++){
          String f = c.substring(0,i)+b+c.substring(i);
          newArr.add(f);
        }
        String d = b + c;
        newArr.add(a);
        newArr.add(d);
      }
      return newArr;
    }

  }

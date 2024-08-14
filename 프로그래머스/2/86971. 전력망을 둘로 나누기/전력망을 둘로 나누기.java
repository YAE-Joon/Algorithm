
class Solution {
  static boolean[] road;
  static int minMax;
  static int count;
  static int trueCount;

  public int solution(int n, int[][] wires) {
    road = new boolean[wires.length];
    minMax = n-1;
    for(int i=0; i<wires.length;i++){
      road[i]=true;
      count =0;
      dfs(wires,1);
      int i1 = n - count-1;
      int i2 = i1- count-1;
      if(i2<0){
        i2 = -i2;
      }

      minMax = Math.min(i2,minMax);
      road = new boolean[wires.length];
    }
    int answer = minMax;


    return answer;
  }


  public void dfs(int[][] wires,int pre){

    for(int l =0; l<wires.length;l++){

      if(!road[l]&&pre==wires[l][0]){
        count = count+1;
      }else if(!road[l]&&pre==wires[l][1]){
        count = count+1;
      }


    }
    for(int l =0; l<wires.length;l++){

      if(!road[l]&&pre==wires[l][0]){
        road[l]=true;
        dfs(wires,wires[l][1]);
      }else if(!road[l]&&pre==wires[l][1]){
        road[l]=true;
        dfs(wires,wires[l][0]);
      }
    }
  }
}
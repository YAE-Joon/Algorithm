import java.util.*;
class Solution {
    
    static int max = -1;
    
    public int solution(int[][] maps) {
        int answer = 0;
        //dfs 로는 효율성 테스트 실패함. 
        //bfs 로 퍼지듯이 접근. 그럼 뒤로 돌아갈일이 없을 것 같음.
        //Stack 이용
        
    
        bfs(maps);
        
        answer = max;
        
        return answer;
    }
    
    
    void bfs(int[][] map){
        
       Deque<Integer[]> toDolist = new ArrayDeque<>();
        boolean[][] isChecked = new boolean[map.length][map[0].length];
        Integer[] point = new Integer[]{0,0,1};
        isChecked[0][0] = true;
        toDolist.push(point);
        
        
        int[][] condition = {{1,0},{0,1},{-1,0},{0,-1}};
        
        while(!toDolist.isEmpty()){
            
            //다음 x,y좌표와 거리
            Integer[] nextPoint = toDolist.pollFirst();
            
            int x = nextPoint[0];
            int y = nextPoint[1];
            int distance = nextPoint[2];

            
            //종점이면 max와 비교
            if(x==map.length-1&&y==map[0].length-1){
                
                    max=distance;
                
                break;
                
            }
            
            
            for(int[] s :condition){
                
                int nextX = x+s[0];
                int nextY = y+s[1];
                
                if(nextX>=0&&nextX<map.length&&nextY>=0&&nextY<map[0].length&&!isChecked[nextX][nextY]&&map[nextX][nextY]==1){
                    isChecked[nextX][nextY]=true;
                    toDolist.add(new Integer[]{nextX,nextY,distance+1});
                }
                
            }
            
            
//            x+1y x,y+1  x-1,y x,y-1
             
            
        
    }
}
}
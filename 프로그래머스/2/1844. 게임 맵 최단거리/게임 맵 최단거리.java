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
        
        
        
        while(!toDolist.isEmpty()){
            
            //다음 x,y좌표와 거리
            Integer[] nextPoint = toDolist.pollFirst();
            
            int x = nextPoint[0];
            int y = nextPoint[1];
            int distance = nextPoint[2];
            //종점이면 max와 비교
            if(x==map.length-1&&y==map[0].length-1){
                
                    max =distance;
                
                break;
                
            }
            
            
            if(x-1>=0){
                
                if(map[x-1][y]==1&&!isChecked[x-1][y]){
                
                isChecked[x-1][y] = true;
                Integer[] nextX = new Integer[]{x-1,y,distance+1};
                toDolist.add(nextX);
            
            }
            }
            if(y-1>=0){
                if(map[x][y-1]==1&&!isChecked[x][y-1]){
                isChecked[x][y-1] = true;
                Integer[] nextY = new Integer[]{x,y-1,distance+1};
                toDolist.add(nextY);
                }
            }
            
             if(x+1<map.length){
                if(map[x+1][y]==1&&!isChecked[x+1][y]){
                isChecked[x+1][y] = true;
                Integer[] nextX2 = new Integer[]{x+1,y,distance+1};
                toDolist.add(nextX2);
                }
            }
            
            
             if(y+1<map[0].length){
                 if(map[x][y+1]==1&&!isChecked[x][y+1]){
                
                isChecked[x][y+1] = true;
                Integer[] nextY2 = new Integer[]{x,y+1,distance+1};
                toDolist.add(nextY2);
                 }
            }
            
        }
        
    }
}
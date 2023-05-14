import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    final static int MAX = 25 + 10;
    static boolean[][] graph;
    static boolean[][] visited;
    static int SizeOfMap;
    static int count;
    static int dirY[] = {1, -1, 0, 0};
    static int dirX[] = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];
        int SizeOfMap = Integer.parseInt(br.readLine());

        for(int i=1; i<=SizeOfMap; i++){
            String s=br.readLine();
            for(int j=1; j<=SizeOfMap; j++){
                graph[i][j]=s.charAt(j-1)=='1';
            }
        }

        ArrayList<Integer> countList =new ArrayList<>();
        for(int i=1; i<=SizeOfMap; i++){
            for(int j=1; j<=SizeOfMap; j++){
                if(!visited[i][j] && graph[i][j]){
                    count=0;
                    dfs(i,j);
                    countList.add(count);
                }
            }
        }

        System.out.println(countList.size());
        Collections.sort(countList);
        for(int i=0; i<countList.size(); i++){
            System.out.println(countList.get(i));
        }
    }

    static void dfs(int y, int x) {
        visited[y][x]=true;
        count++;
        for(int i=0; i<4; i++){
            int newy = y+dirY[i];
            int newx = x+dirX[i];
            if(!visited[newy][newx] && graph[newy][newx]){
                dfs(newy, newx);
            }
        }
    }

}

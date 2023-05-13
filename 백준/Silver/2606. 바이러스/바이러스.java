import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int NumberOfCumputer ,NumberOfLine;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberOfCumputer=sc.nextInt();
        NumberOfLine=sc.nextInt();

        graph = new boolean[NumberOfCumputer+2][NumberOfCumputer+2];
        visited = new boolean[NumberOfCumputer+2];

        int x,y;
        for(int i=0; i<NumberOfLine; i++){
            x=sc.nextInt();
            y=sc.nextInt();
            graph[x][y]=graph[y][x]=true;
        }
        
         dfs(1);
        System.out.println(result-1);
        sc.close();
    }

    private static int dfs(int index) {
        result++;
        visited[index]=true;

        for (int i=1; i<=NumberOfCumputer; i++){
            if(!visited[i] && graph[index][i]){
                dfs(i);
            }
        }
        return result;
    }
}

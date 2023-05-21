import java.util.Scanner;

public class Main {
    static int N;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        graph = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            graph[i] = scanner.next().toCharArray();
        }

        int normalCount = 0;
        int colorWeaknessCount = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    dfs(i, j, graph[i][j]);
                    normalCount++;
                }
            }
        }

        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 'G'){
                    graph[i][j] = 'R';
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j]){
                    dfs(i, j, graph[i][j]);
                    colorWeaknessCount++;
                }
            }
        }

        System.out.println(normalCount + " " + colorWeaknessCount);
    }

    public static void dfs(int x, int y, char color){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(graph[nx][ny] == color && !visited[nx][ny]){
                    dfs(nx, ny, color);
                }
            }
        }
    }
}

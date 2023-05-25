import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 배열 초기화
        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(a, b);
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 구간[a,b]를 역순으로 뒤집는 함수
    static void reverse(int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}

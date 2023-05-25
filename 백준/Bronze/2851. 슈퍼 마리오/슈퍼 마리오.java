import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mushrooms = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            if (Math.abs(100 - sum) >= Math.abs(100 - (sum + mushrooms[i]))) {
                sum += mushrooms[i];
            } else {
                break;
            }
        }

        System.out.println(sum);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long w = sc.nextLong();
        long s = sc.nextLong();

        if (x < y) {
            long temp = x;
            x = y;
            y = temp;
        }

        long result = calculateTime(x, y, w, s);
        System.out.println(result);
    }

    public static long calculateTime(long x, long y, long w, long s) {
        if (2 * w <= s) {
            return (x + y) * w;
        } else if (w <= s) {
            return y * s + (x - y) * w;
        } else {
            if ((x + y) % 2 == 0) {
                return Math.max(x, y) * s;
            } else {
                return (Math.max(x, y) - 1) * s + w;
            }
        }
    }
}

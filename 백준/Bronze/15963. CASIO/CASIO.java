import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();


        long result = compare(x,y);
        System.out.println(result);
    }

    public static long compare(long x,long y) {

         long ans = 0;
        if (x == y) {
            ans = 1;
        } else if (x != y) {
            ans = 0;
        }
        return ans;
    }
}

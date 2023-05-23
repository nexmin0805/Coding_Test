import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<N; i++){
            set.add(sc.nextInt());
        }

        M=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            if(set.contains(sc.nextInt())){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }
}

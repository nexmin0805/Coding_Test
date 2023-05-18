import java.util.*;

public class Main {

    static int A_Score=0;
    static int B_Score=0;
    static char result;
    static int[] A= new int[10];
    static int[] B= new int[10];
    static char[] check = new char[10];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            B[i]=sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(A[i]<B[i]){
                B_Score+=3;
                check[i]='B';
            }
            else if(A[i]==B[i]){
                A_Score++;
                B_Score++;
                check[i]='D';
            }
            else if(A[i]>B[i]){
                A_Score+=3;
                check[i]='A';
            }
        }

        if(A_Score<B_Score){
            result='B';
        }
        else if(A_Score>B_Score){
            result='A';
        }
        else {
            for (int i = 9; i >= 0; i--) {
                if (check[i] != 'D') {
                    result = check[i];
                    break;
                }
                if (i == 0) {
                    result = 'D';
                }
            }
        }

        System.out.printf("%d %d\n" ,A_Score, B_Score);
        System.out.println(result);
    }
}

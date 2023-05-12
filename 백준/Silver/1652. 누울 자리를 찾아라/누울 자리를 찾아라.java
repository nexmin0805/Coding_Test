import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        char[][] room = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = line.charAt(j);
            }
        }

        int hresult = hcalculate(n, room);
        int vresult = vcalculate(n, room);
        System.out.println(hresult+" "+vresult);
    }

    private static int hcalculate(int n, char[][] room) {

        int horizontal = 0;
        int hcnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    horizontal++;
                } else{
                    if (horizontal >= 2) {
                        hcnt++;
                    }
                    horizontal=0;
                }
            }
            if (horizontal >= 2) {
                hcnt++;
            }
            horizontal=0;
        }

        return hcnt;
    }

    private static int vcalculate(int n, char[][] room) {

        int vertical = 0;
        int vcnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (room[j][i] == '.') {
                    vertical++;
                }else{
                    if(vertical>=2){
                        vcnt++;
                    }
                        vertical = 0;
                    }
                }
            if(vertical>=2){
                vcnt++;
            }
                vertical = 0;
            }
        return vcnt;
    }
}

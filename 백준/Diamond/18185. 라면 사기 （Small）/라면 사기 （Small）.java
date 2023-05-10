import java.util.*;

public class Main {
    static int[] factory = new int[10003];
    static int numberofFactory;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        numberofFactory = sc.nextInt();
        for(int i = 1; i <= numberofFactory; i++)
            factory[i] = sc.nextInt();

        for(int i = 1; i <= numberofFactory; i++){
            // 3개 불가능
            if(factory[i+1] > factory[i+2]){
                int count = Math.min(factory[i], factory[i+1] - factory[i+2]);
                answer += 5*count;

                factory[i] -= count;
                factory[i+1] -= count;

                int count2 = Math.min(factory[i], Math.min(factory[i+1], factory[i+2]));
                answer += 7*count2;

                factory[i] -= count2;
                factory[i+1] -= count2;
                factory[i+2] -= count2;
            }
            else{
                // 3개 가능
                int count = Math.min(factory[i], Math.min(factory[i+1], factory[i+2]));
                answer += 7*count;

                factory[i] -= count;
                factory[i+1] -= count;
                factory[i+2] -= count;

                int count2 = Math.min(factory[i], factory[i+1]);
                answer += 5*count2;

                factory[i] -= count2;
                factory[i+1] -= count2;
            }
            answer += 3*factory[i];
            factory[i] = 0;
        }

        System.out.println(answer);
    }
}

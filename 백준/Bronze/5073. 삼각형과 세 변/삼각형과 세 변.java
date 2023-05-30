import java.util.*;

public class Main {
    static int[] arr = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            for(int i=0; i<3; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1]+arr[2]==0){
                break;
            }
            if(arr[2]>= arr[0]+arr[1]){
                System.out.println("Invalid");
            }else if(arr[0]==arr[1]&&arr[0]==arr[2]){
                System.out.println("Equilateral");
            }else if(arr[0]==arr[1] || arr[0]==arr[2] || arr[1]==arr[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }while(arr[0]!=0 && arr[1]!=0 && arr[2]!=0);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] participant = new String[n];
        String[] completion = new String[n-1];
        for(int i=0; i<n; i++) {
            participant[i] = sc.next();
        }
        for(int i=0; i<n-1; i++) {
            completion[i] = sc.next();
        }
        String result = find(participant, completion);

        System.out.println(result);
    }

    public static String find(String[] participant, String[] completion){

        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}

import java.util.Scanner;
public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1385757879;
        int d = in.nextInt();
        int count = 0;
        while(n>0){
            if(n%10 == d){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }

}

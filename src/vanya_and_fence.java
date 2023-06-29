import java.util.Scanner;

public class vanya_and_fence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int a;
        int count = 0;
        for(int i=0; i<n; i++){
            a = in.nextInt();
            if(a>h){
                count++;
            }
        }
        System.out.println(n+count);
    }
}

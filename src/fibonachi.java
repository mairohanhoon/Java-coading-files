import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fib;
        if(n==0){
            fib = 0;
        }
        else{
            int a = 0;
            int b = 1;
            fib = 0;
            n--;
            do {
                int x = a + b;
                a = b;
                b = x;
                fib = x;
                n--;
            } while (n>0);
        }
        System.out.println(fib);
    }
}

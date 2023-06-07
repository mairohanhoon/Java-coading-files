import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // TYPE CASTING
        int num1 = (int)(69.98f);
        System.out.println(num1);

        // automatice type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);
    }
}

// Two types should be compaitable
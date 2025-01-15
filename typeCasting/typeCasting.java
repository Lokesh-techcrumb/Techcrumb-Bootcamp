package typeCasting;

import java.util.*;

public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Explicit Conversion or narrowing
        float a = 25.12f;
        int b = (int) a;

        char ch = 'a';
        char ch2 = 'b';

        int AsciiValue = ch;
        int AsciiValue2 = ch2;

        System.out.println(a);
        System.out.println(b);

        System.out.println(AsciiValue);
        System.out.println(AsciiValue2);
        sc.close();
    }
}

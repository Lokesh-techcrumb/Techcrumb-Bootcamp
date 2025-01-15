package typeConversion.typePromoting;
import java.util.Scanner;

public class typePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //type Promotion
        char a = 'a';
        char b = 'b';

        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b-a);

        int c = 10;
        float d = 25.50f;
        long e = 30;
        double f = 40;
        int ans = (int)(c+d+e+f);

        System.out.println(ans);

        //INVALID CONVERSION
        // byte b = 5;
        // b = b*2;

        //VALID CONVERSION
        byte g = 5;
        g = (byte)(g*2);

        System.out.println(g);

        sc.close();
    }
}

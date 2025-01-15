package typeConversion;
import java.util.*;

public class typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //implicit Conversion
        int a = 5;
        long b = a; // VALID TYPE CONVERSION
        // long c = 1;
        // int d = c; // INVALID TYPE CONVERSION
        System.out.println(b);
        sc.close();
    }
}

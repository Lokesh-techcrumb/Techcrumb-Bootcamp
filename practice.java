public class practice {

    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        System.out.println(x + " " + y + " " + z);
        x += y;
        System.out.println(x + " " + y + " " + z);
        y -= z;
        System.out.println(x + " " + y + " " + z);
        z = z/(x + y);
        System.out.println(x + " " + y + " " + z);
}

}   
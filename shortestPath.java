import java.util.Scanner;

public class shortestPath {

    public static float getShortestDistance(String path, int x, int y) {
        int X1 = x, Y1 = y;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if('S' == dir){
                y--;
            }
            else if('N' == dir){
                y++;
            }
            else if('E' == dir){
                x++;
            }
            else if('W' == dir){
                x--;
            }
        }
        int X = X1-x;
        int Y = Y1-y;
        return (float) Math.sqrt((X*X)+(Y*Y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Direction Path In Capital Letter:");
        String path = sc.next(); 
        System.out.println("Please Enter Starting point according to X&Y Coordinates:");
        System.out.println("Please Enter X Coordinate");
        int x = sc.nextInt();
        System.out.println("Please Enter Y Coordinate");
        int y = sc.nextInt();

        System.out.println("Shortest distance acoording to given given path is " + getShortestDistance(path, x, y));
        sc.close();
    }
}

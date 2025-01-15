package array;

public class array {
    public static void main(String[] args) {
        int arr[] = new int[50]; //array Creation

        for(int i = 0; i < arr.length/2; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }
}

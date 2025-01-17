// Create a two dimensional array of integers and display:
// sum of all elements of each column
// sum of all elements of each row

package java1Assignment;

import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        int sum;

        System.out.println();

        System.out.println("Sum of all elements of each column");
        for(int i = 0; i < c; i++){
            sum = 0;
            for(int j = 0; j < r; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of all elements of Column "+(i+1)+" is " + sum);
        }

        System.out.println();

        System.out.println("Sum of all elements of each row");
        for(int i = 0; i < r; i++){
            sum = 0;
            for(int j = 0; j < c; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of all elements of row "+(i+1)+" is " + sum);
        }

        sc.close();

    }
}

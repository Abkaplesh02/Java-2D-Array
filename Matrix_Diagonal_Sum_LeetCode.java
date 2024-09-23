import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Diagonal_Sum_LeetCode {
    public static int DiagnolSum(int arr[][]) {
        int i = 0;
        int j = 0;
        int Sum = 0;

        while (i < arr.length || j < arr[0].length) {
            Sum += arr[i][arr.length - 1 - i];
            arr[i][arr.length - 1 - i] = 0;

            if (i == j) {
                Sum += arr[i][j];
                arr[i][j] = 0;
            }
            i++;
            j++;


        }
    return Sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int a = sc.nextInt();
        System.out.println("Enter number of columns :");
        int b = sc.nextInt();

        int arr1[][] = new int[a][b];

        System.out.println("Enter the value of 2D arrays :: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The resulted 2D array is :: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println("The diagnol sum is :: " + DiagnolSum(arr1));
    }
}

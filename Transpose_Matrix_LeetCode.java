import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Matrix_LeetCode {

    public static int [][] Transpose(int arr[][]){
        int arr1[][]=new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        return arr1;
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

        System.out.println("The diagnol sum is :: " );
        int arr2[][]=Transpose(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

    }
}

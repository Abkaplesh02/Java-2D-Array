import java.util.Arrays;
import java.util.Scanner;

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_LeetCode {

    public static boolean Matrix(int arr1[][],int arr2[][]){

        int n=arr1.length;
        for(int i=0;i<=3;i++){
            int r[][]=new int[n][n];
            for(int j=0;j< arr1.length;j++){
                for(int l=0;l<arr1.length;l++){
                    r[l][n-1-j]=arr1[j][l];
                }
            }
            if(Arrays.deepEquals(r,arr2)){
                return true;
            }

            arr1=r;
        }
        return false;

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


        System.out.println("Enter number of rows :");
        int c = sc.nextInt();
        System.out.println("Enter number of columns :");
        int d = sc.nextInt();

        int arr2[][] = new int[c][d];

        System.out.println("Enter the value of 2D arrays :: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The resulted 2D array is :: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        System.out.println("The matrix can be obtained by rotation :: " + Matrix(arr1,arr2));
    }
}

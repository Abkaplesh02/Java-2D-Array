import java.util.Arrays;
import java.util.Scanner;

public class Cells_with_Odd_Values_in_a_Matrix_LeetCode {
    public static int [][] matrix(int indices[][], int m,int n){
      int arr[][]=new int[m][n];
      for(int i=0;i<indices.length;i++){
          int a=indices[i][0];
          int b=indices[i][1];
          for(int j=0;j<arr[0].length;j++){
              arr[a][j]++;
          }
          for(int k=0;k<arr.length;k++){
              arr[k][b]++;
          }
      }

      return arr;

    };

    public static int pair(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int a=sc.nextInt();
        System.out.println("Enter number of columns :");
        int b=sc.nextInt();

        int arr1[][]=new int [a][b];

        System.out.println("Enter the value of 2D arrays :: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The resulted 2D array is :: ");
        for(int i=0;i< arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }

        System.out.println("The answer is :: ");
        int arr2[][]=matrix(arr1,2,2);
        for(int i=0;i< arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }

        System.out.println("The number of odd pairs are :: " + pair(arr2));
    }
}

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int [3][3];

        System.out.println("Enter the value of 2D arrays :: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The resulted 2D array is :: ");
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }

//        for(int i=0;i< arr1.length;i++){
//            System.out.println(Arrays.toString(arr1[i]));
//        }

        for(int[] i : arr1){
            System.out.println(Arrays.toString(i));
        }

        }
    }

import java.util.Arrays;
import java.util.Scanner;

public class BSin2DArray {
    public static void BS(int arr[][] , int a){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length-1 && col>0){
            if(a==arr[row][col]){
                System.out.println(row+" " + col);
                return;
            }
            else if(arr[row][col]>a){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 2d array :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter the elements of 2D array :: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of array are :: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Enter the element to search in 2D array :: ");
        int c= sc.nextInt();;
        System.out.print("The element is present at :: " );
        BS(arr,c);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Population_Year_LeetCode {
    public static int MaxPop(int arr[][]){

        int Freq[]=new int[101];
        for(int i=0;i<arr.length;i++){
            int birth=(arr[i][0])-1950;
            int death=(arr[i][1])-1950;
            for(int j=birth;j<death;j++){
                Freq[j]++;
            }
        }
        int max=Freq[0];
        int year =1950;
        for(int i=1;i<101;i++){
            if(Freq[i]>max){
                max=Freq[i];
                year=1950+i;
            }
        }
        return year;
    }



    public static int MaxPopu(int arr[][]){

        int Freq[]=new int[101];
        for(int i=0;i<arr.length;i++){
            int birth=(arr[i][0])-1950;
            int death=(arr[i][1])-1950;
            Freq[birth]++;
            Freq[death]--;
        }
        int max=Freq[0];
        int year =1950;
        for(int i=1;i<101;i++){
            Freq[i]+=Freq[i-1];
            if(Freq[i]>max){
                max=Freq[i];
                year=1950+i;
            }
        }
        return year;
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

        System.out.println("The maximum population year is :: " + MaxPopu(arr1));
    }
}

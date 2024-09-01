import java.util.Arrays;
import java.util.Scanner;

public class BSinStrictlySOrtedMatrix {
    public static void BS2D(int arr[][] , int a){
        int RowS=0;
        int RowE=arr.length-1;
        int ColMid=(arr[0].length-1)/2;
        while(RowS<(RowE-1)){
            int mid=RowS+(RowE-RowS)/2;
            if(arr[mid][ColMid]==a){
                System.out.println(mid + " " + ColMid);
                return;
            }
            else if(arr[mid][ColMid]>a){
                RowE=mid;
            }
            else{
                RowS=mid;
            }
        }

//        Searching in Middle column first
        if(arr[RowS][ColMid]==a){
            System.out.println(RowS + " " + ColMid);
            return;
        }
        if(arr[RowS+1][ColMid]==a){
            System.out.println(RowS+1 + " " + ColMid);
            return;
        }
//        Search in first part
        if(a<=arr[RowS][ColMid-1]){
            System.out.println(Arrays.toString(BS(arr,a,RowS,0,ColMid-1)));
            return;
        }
//        Search in second half
        if(a>=arr[RowS][ColMid+1]){
            System.out.println(Arrays.toString(BS(arr,a,RowS,ColMid+1, arr[0].length-1)));
            return ;
        }
//        Search in third half
        if(a<=arr[RowS+1][ColMid]){
            System.out.println(Arrays.toString(BS(arr,a, RowS+1,0,ColMid-1)));
            return;
        }
//        Search in fourth half
        if(a>=arr[RowS+1][ColMid+1]){
            System.out.println(Arrays.toString(BS(arr,a,RowS+1,ColMid+1,arr[0].length-1)));
            return;
        }
        System.out.println("The element is not found :: ");

    }
    public static int[] BS(int arr[][], int target, int row , int ColS , int ColE){
        while(ColS<ColE){
            int mid=ColS+(ColE-ColS)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]>target){
                ColE=mid-1;
            }
            else{
                ColS=mid+1;
            }
        }

        return new int[]{-1,-1};
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
        BS2D(arr,c);
    }
}

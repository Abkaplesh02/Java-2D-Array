import java.util.ArrayList;
import java.util.Scanner;

public class DArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(12);

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        System.out.println("The size of 2D array list is :: " + list.size());

        for(int i=0;i<3;i++){
            for(int j=0;j<9;j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println("The list is :: " + list);

    }
}

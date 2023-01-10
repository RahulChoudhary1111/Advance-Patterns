import java.util.*;
public class Selectionsort{
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }

            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;

        }
    }
     //print arr
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Selection(arr);
        printArr(arr);
    }


}
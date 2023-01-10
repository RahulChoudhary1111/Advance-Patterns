import java.util.*;
public class Alloccurance{

    public static int AllOccurance(int arr[],int key,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            System.out.print(idx + " ");
        }
        return AllOccurance(arr,key,idx+1);
    }
    public static void main(String args[]){
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        AllOccurance(arr,2,0);
    }
}
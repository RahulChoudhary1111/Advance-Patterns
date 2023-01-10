import java.util.*;
public class TowerofHanoi{
    public static int last=-1;
    public static int lastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            System.out.println(last);
        }
        if(i==arr.length){
            return -1; 
        }
        if(arr[i]==key){
            last=i;
        }
        return lastOccurance(arr , key , i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2,4,6,2,8,9,2,2};
        lastOccurance(arr,2,0);
    }
}
        
        
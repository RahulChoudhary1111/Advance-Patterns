import java.util.*;
public class twiceinArray{
    public static boolean pairs(int [] numbers){
        for(int i=0;i<=numbers.length-1;i++){
            
            for(int j=i+1;j<=numbers.length-1;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String args[]){
        int[] duplicate={1,2,4,5,7};
        System.out.println(pairs(duplicate));
    }
   
}
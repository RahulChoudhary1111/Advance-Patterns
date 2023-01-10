import java.util.*;
public class LengthOfString {
    public static int Length(String str,int i,int a){
        if(i==str.length()){
            System.out.println(a); 
        }
        if(i==str.length()){
            return 0;
        }  
         return Length(str,i+1,a+1);
    } 
    public static void main(String args[]){
        String str="abcdefghijklmnopqrstuvwxyz";
        Length(str,0,0);
    }
}

        


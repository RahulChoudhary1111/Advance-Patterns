import java.util.*;
public class InvertedHalfPyramid{
    public static void main(String args[]){
        System.out.print("enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop for rows
        for(int i=0;i<n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            //star
            // for(int j=1;j<=n;j++){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}
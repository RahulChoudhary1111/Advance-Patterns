import java.util.*;
public class PalindromeNoPyramid{
    public static void main(String args[]){
        System.out.print("enter the number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //descending numbers
            for(int j=i;j>=1;j--){
               System.out.print(j);
            }
            //ascendiing numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


        
import java.util.*;
public class Function{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer :");
        int num = sc.nextInt();
        System.out.println("the sum is: " + sumdigits(num));
    }
    
    public static int sumdigits(int n){
        int sum=0;
        while(n>0){
            int lastdigit= n%10;
            sum += lastdigit;
            n/=10;
        }
        return sum;
    }
}    

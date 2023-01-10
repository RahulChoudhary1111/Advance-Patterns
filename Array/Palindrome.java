import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no : ");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println("given no. is palindrome");
        }
        else{
            System.out.println("given no. is not palindrome");
        }


    }
    public static boolean isPalindrome(int num){
        int palind = num;
        int reverse = 0;

        while(palind!=0){
            int remainder=palind % 10;
            reverse = reverse * 10 + remainder;
            palind = palind/10;
        }

        if(num==reverse){
            return true;
        }
        else{
            return false;
        }

    }
} 
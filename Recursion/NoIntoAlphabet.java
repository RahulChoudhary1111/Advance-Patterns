import java.util.*;
public class NoIntoAlphabet{

    public static void words(int no){
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(no==0){
            return;
        }
        int lastDigit=no%10;
        words(no/10);
        System.out.print(digits[lastDigit]+" ");

        
    }
    public static void main(String args[]){
    words(019);

    }

}
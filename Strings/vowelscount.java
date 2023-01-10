import java.util.*;
public class vowelscount{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String sb = sc.nextLine();
        int count =0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("total vowels in the given string are"+ count);
    }
}
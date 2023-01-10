import java.util.*;
public class LinearSearch{


    public static String LinearfruitSearch(String name [],String key){
        for(int i=0; i<name.length; i++){
            if(fruits[i]==key){
               return i;
                
                }
        }
        return -1;
    }
    public static void main(String args[]){

         String fruits[]={Apple, Banana, Grappes, Lemon, Mango, Orange, Pappaya, Sugarcane};
         String key= Mango;
         int index=LinearfruitSearch(String fruits; String key;);
         if(index == -1){

           System.out.println("not found");
         }
         else{
           System.out.println("your key ia at index : "+ index);
         }
    }
    


}
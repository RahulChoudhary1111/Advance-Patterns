import java.util.*;
public class LonelyNumber {
    public static void lonely(ArrayList<Integer>list){
        Collections.sort(list);
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if((list.get(i)+1 < list.get(i+1))  && (list.get(i)>list.get(i-1)+1)){
               list2.add(list.get(i));
            }
        }    
        if(list.size()==1){
            list2.add(list.get(0));
        }
        if(list.size()>1){
            if((list.get(list.size()-2)+1 < list.get(list.size()-1))){
                list2.add(list.get(list.size()-1));
            }
            if(list.get(0)+1 < list.get(1)){
                list2.add(list.get(0));
            }
        }    
        
        System.out.println(list2);
    }
    public static void main(String args[]) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(8 );
        list.add(8);
        list.add(6);
        list.add(1);
        lonely(list);
    }
}

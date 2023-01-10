import java.util.*;
public class countingElement2d{
    public static int Elementcount(int matrix[][]){
        int n = matrix.length, m = matrix[0].length, count=0;
        
            for(int j=0;j<m;j++){
                 count+=matrix[2][j];

                
            }
        
        return count;
        
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                         {8,8,7},
                         {2,2,3}};
         
        System.out.println(Elementcount(matrix));

    }
}
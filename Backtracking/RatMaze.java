import java.util.*;
public class RatMaze{
    public static boolean isSafe(int maze[][],int row,int col){
        //right
        if(maze[row][col]==0){
            return false;
        }
        return true;
    }
    public static int mazeWays(int maze[][],int row,int col){
        if(row==3 && row==3){//condition for last cell
            return 1;
        }
        if(row==4 && col==4){//boundary cross condition
            return 0;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(isSafe(maze,i,j)){
                    int w1=mazeWays(maze,i+1,j);
                    int w2=mazeWays(maze,i,j+1);
                    
                }

            }
        }
        return w1+w2 ;
    }
    public static void main(String args[]){
        int maze[][]={{1,0,0,0},
                      {1,1,0,1},
                      {0,1,0,0},
                      {1,1,1,1}};
        System.out.println(mazeWays(maze,0,0));              
    }
}
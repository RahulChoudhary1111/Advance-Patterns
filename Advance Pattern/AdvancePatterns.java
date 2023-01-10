import java.util.Scanner;

public class AdvancePatterns {
    public static void hollow_rectangle(int a){
        for(int i = 0; i <= a;i++){
            for(int j = 0;j <= a;j++){
                if(i==0 || i==a || j==0 || j==a){
                    System.out.print('*' + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_and_rotated_half_pyramid(int a){
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= a-i; j++){
                System.out.print(" " + " ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int a){
        for(int i=0;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int a){
        int counter = 1;
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int a){
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ; j <= i ; j++){
                if((i+j)%2==0){
                    System.out.print("1" + " ");
                }
                else
                System.out.print("0" + " ");
            }
            System.out.println();
        }
    } 
    public static void butterfly(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            for(int k=1;k<=2*(a-i);k++){
                System.out.print(" " + " ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            for(int k=1;k<=2*(a-i);k++){
                System.out.print(" " + " ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=(a-i);j++){
                System.out.print(" " + " ");
            }
            for(int k=1;k<=a;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=(a-i);j++){
                System.out.print(" " + " ");
            }
            for(int k=1;k<=a;k++){
                if(i==1 || i==a || k==1 || k==a){
                    System.out.print("*" + " ");
                }
                else
                System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
    public static void diamond(int a){
        //outer loop
        for(int i=1;i<=a;i++){
            //space
            for(int j=1;j<=a-i;j++){
                System.out.print(" " + " ");
            }
            //star
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //outer loop
        for(int i=a;i>=1;i--){
            //spaces
            for(int j=1;j<=a-i;j++){
                System.out.print(" " + " ");
            }
            //star
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void number_pyramid(int a){
        for(int i= 1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void palindromic_pattern(int a){
        for(int i= 1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main (String args []){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no. of lines: ");
            int a = sc.nextInt();
            System.out.println("Type 1: for hollow rectangle");
            System.out.println("Type 2: for inverted and rotated half pyramid");
            System.out.println("Type 3: for inverted half pyramid ");
            System.out.println("Type 4: for floyds triangle");
            System.out.println("Type 5: for zero one triangle");
            System.out.println("Type 6: to print butterfly");
            System.out.println("Type 7: to print solid rhombus");
            System.out.println("Type 8: to print hollow rhombus");
            System.out.println("Type 9: to print diamond");
            System.out.println("Type 10: to print number pyramid");
            System.out.println("Type 11: to print palindromic pattern");
            int choice = sc.nextInt();
            switch(choice){
                case 1:  
                    hollow_rectangle(a);
                    break;
                case 2: 
                    inverted_and_rotated_half_pyramid(a);
                    break;
                case 3:
                    inverted_half_pyramid(a);
                    break;
                
                case 4:
                    floyds_triangle(a);
                    break;
                
                case 5:
                    zero_one_triangle(a);
                    break;

                case 6:
                    butterfly(a);
                    break; 
                    
                case 7:
                    solid_rhombus(a);
                    break;    

                case 8:
                    hollow_rhombus(a);
                    break;
                        
                case 9:
                    diamond(a);
                    break;
                           
                case 10:
                    number_pyramid(a);
                    break;
                        
                case 11:
                    palindromic_pattern(a);
                    break;
                        
                default: System.out.println("enter a valid choice between 1 to 11");
            }
        }
        

    }
}

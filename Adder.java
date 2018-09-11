import java.util.*;
class Adder {
    public static void main(String[]args){
        int a=0; 
        int b=0; 
        int x=0; 
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter a  ");
             a =sc.nextInt();
        System.out.print("Enter b  "); 
             b =sc.nextInt();
        
        x=a/b; 
        System.out.print("Sum= "+x);
    }
}
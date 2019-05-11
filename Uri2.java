

import java.util.Scanner;


public class Uri2 {
    public static void main(String[] args){
       double A;
       double r=3.14159;
       double R;
       
       Scanner sc=new Scanner(System.in);
       
       R=sc.nextDouble();
       
       A=r*Math.pow(R,2);
     
       System.out.printf("A=%.4f\n",A);
       
    
    }
}


import java.util.Scanner;


public class Uri11 {
   public static void main(String[] args){
       double VOLUME;
       double r=3.14159;
       double R;
       
       Scanner sc=new Scanner(System.in);
       
       R = sc.nextDouble();
       
       VOLUME = (4 * r *R * R * R)/3;
     
       System.out.printf("VOLUME = %.3f\n",VOLUME);
       
    
    } 
}

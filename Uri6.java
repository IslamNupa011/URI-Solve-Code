
import java.util.Scanner;


public class Uri6 {
     public static void main(String[] args){
       float A,B,C,MEDIA;
       
               Scanner sc=new Scanner(System.in);
               
               A = sc.nextFloat();
               B = sc.nextFloat();
               C = sc.nextFloat();
                 
               MEDIA = (float)((A/10 * 2) + (B/10 * 3) + (C/10 * 5));
                   System.out.printf("MEDIA = %.1f\n",MEDIA);
    
    }
}

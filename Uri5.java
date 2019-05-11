
import java.util.Scanner;


public class Uri5 {
    public static void main(String[] args){
       double A,B,MEDIA;
       
               Scanner sc=new Scanner(System.in);
               
               A = sc.nextDouble();
               B = sc.nextDouble();
            
               MEDIA=((A/11 * 3.5) + (B/11 * 7.5));
               System.out.printf("MEDIA = %.5f\n",MEDIA);
    
    }
}

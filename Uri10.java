
import java.util.Scanner;


public class Uri10 {
    public static void main(String[] args){
         int a,b,x,y;
         double c,z,result;
         
         Scanner sc=new Scanner(System.in);
         
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextDouble();
         
         x = sc.nextInt();
         y = sc.nextInt();
           z = sc.nextDouble();
       
    
         result = b*c + y*z;
         
         System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
         
    }
}

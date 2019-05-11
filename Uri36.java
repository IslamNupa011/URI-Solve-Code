
import java.util.Scanner;



public class Uri36 {
    public static void main(String[] args){
              double a,b,c,R1,R2;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
           if((a==0)||(b*b-4*a*c)<0){
               System.out.print("Impossivel calcular\n");
           }
           else{
            R1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            R2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
           
            
           System.out.printf("R1 = %.5f\n", R1);
           System.out.printf("R2 = %.5f\n", R2);
           }
}
}

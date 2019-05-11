
import java.util.Scanner;


public class Uri12 {
    public static void main(String[] args){
       double A,B,C,res1,res2,res3,res4,res5;
       double pi=3.14159;
       Scanner sc=new Scanner(System.in);
       
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
         
        res1 = 0.5*A*C;
        res2 = pi*C*C;
        res3 = 0.5*C*(A+B);
        res4 = B*B;
        res5 = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n", res1);
           System.out.printf("CIRCULO: %.3f\n", res2);
              System.out.printf("TRAPEZIO: %.3f\n", res3);
                 System.out.printf("QUADRADO: %.3f\n", res4);
                    System.out.printf("RETANGULO: %.3f\n", res5);
    }
}

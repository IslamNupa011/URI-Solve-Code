
import java.util.Scanner;


public class Uri43 {
     public static void main(String[] args){
        float a,b,c,perimeter,area;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
           
           if((a+b>c)&&(a+c>b)&&(b+c>a)){
               perimeter = a+b+c;
               System.out.printf("Perimetro = %.1f\n",perimeter);
           
           }
            
           else{
              area = ((a+b)*c)/2;
              System.out.printf("Area = %.1f\n",area); 
           }
            
            
            
}
}

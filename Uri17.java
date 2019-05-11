
import java.util.Scanner;


public class Uri17 {
    public static void main(String[] args){
              double a,b,c,res;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextInt();
            b = sc.nextInt();
            
            c = a*b;
            res = (c/12);
            
           System.out.printf("%.3f\n", res);
}
}

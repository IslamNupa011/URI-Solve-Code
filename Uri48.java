
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nupa
 */
public class Uri48 {
    public static void main(String[] args){
         
         double a;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextDouble();
            
            
            if(a<=400.00){
            
               System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", a+(a*0.15), a * 0.15);
            }
            else
                if(a<=800.00){
                   System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", a+(a*0.12), a * 0.12);
                }
                else 
                    if(a<=1200.00){
                     System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", a+(a*0.10), a * 0.10);
                    }
                else 
                    if(a<=2000.00){
                     System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", a+(a*0.07), a * 0.07);
                    }
                 else 
                   {
                      System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", a+(a*0.04), a * 0.04);
                    }
         
     }
}

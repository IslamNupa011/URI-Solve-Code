
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
public class Uri51 {
     public static void main(String[] args){
         
         double a;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextDouble();
             if ((a>=0.00)&&(a<=2000.00)){
                   System.out.printf("Isento\n");
          }
            else  if ((a>=2000.01)&&(a<=3000.00)){
                   System.out.printf("Isento\n");
          }
             else  if ((a>=3000.01)&&(a<=4500.00)){
                   System.out.printf("Isento\n");
          }
             else  if (a>4500.00){
                   System.out.printf("Isento\n");
          }
             
  
            
}
}

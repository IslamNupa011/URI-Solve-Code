
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
public class Uri116 {
    public static void main(String[] args){
         int N,i,a,b;
         float c;
         
         Scanner input=new Scanner(System.in);
          N =input.nextInt();
           for (i = 1; i <= N; i++) {
                   a=input.nextInt();
                   b=input.nextInt();
                
                   if(b==0){
                     System.out.println("divisao impossivel");
                   }
                   else{
                       c=(float)a/b;
                     System.out.printf("%.1f\n",c);
                   }
                }
           
           
         }
}

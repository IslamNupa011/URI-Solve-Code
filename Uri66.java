
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
public class Uri66 {
    public static void main(String[] args){
         int X;
         int i,positive=0,negative=0,even=0,odd=0;
         Scanner sc=new Scanner(System.in);
         for(i=1;i<=5;i++){
             X=sc.nextInt();
              if (X % 2 == 0) {
    even =even + 1;
   }
   if (X % 2 != 0) {
    odd =odd + 1;
   }
   if (X > 0) {
    positive =positive + 1;
   }
   if (X < 0) {
    negative =negative+ 1;
   }
             
         
         }
         System.out.println(even+" valor(es) par(es)");
          System.out.println(odd+" valor(es) impar(es)");
         System.out.println(positive+" valor(es) positivo(s)");
          System.out.println(negative+" valor(es) negativo(s)");
           
    }
}

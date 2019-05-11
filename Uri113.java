
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
public class Uri113 {
    public static void main(String[] args){
         int a ,b ,i;
        
         Scanner input=new Scanner(System.in);
        
            do{
                   a =input.nextInt();
                    b =input.nextInt();
                    if (a > b) {

                         System.out.print("Decrescente\n");

                   } 
                    else if (a < b) {

                         System.out.print("Crescente\n");

                   }
                 
            }while(a!=b);
         }
}


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
public class Uri133 {
    public static void main(String[] args){
         int N,i,a,b;
         float c;
         
         Scanner input=new Scanner(System.in);
          
          
                   a=input.nextInt();
                   b=input.nextInt();
                
                   
                if(a>b){
                   
                   for(i=b+1;i<=a;i++){
                     if((i%5)==2 ||((i%5)==3) ){
                      
                      System.out.println(i); 
                     }
                   
                   }
                 
                }
                else if(b > a){

            for (i = a+1 ; i < b; i++) {

                if (i % 5 == 2 || i % 5 == 3) {

                    System.out.print(i+"\n");

                }

            }

        }
           
           
         }
}

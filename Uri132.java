
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
public class Uri132 {
    public static void main(String[] args){
         int N,i,a,b;
         float c;
         
         Scanner input=new Scanner(System.in);
          
          
                   a=input.nextInt();
                   b=input.nextInt();
                
                   
                if(a>b){
                   int sum=0;
                   for(i=b;i<=a;i++){
                     if((i%13)!=0 ){
                       sum=sum+i;
                     
                     }
                   
                   }
                  System.out.println(sum); 
                }
                else if(a<b){
                   int sum1=0;
                   for(i=a;i<=b;i++){
                     if((i%13)!=0 ){
                       sum1=sum1+i;
                     
                     }
                   
                   }
                System.out.println(sum1);
                }
           
           
         }
}

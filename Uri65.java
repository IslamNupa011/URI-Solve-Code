
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
public class Uri65 {
    public static void main(String[] args){
         double n;
         int i,count=0;
         Scanner sc=new Scanner(System.in);
         for(i=1;i<=5;i++){
             n=sc.nextDouble();
             if(n%2==0){
               count++; 
             }
         
         }
         System.out.printf("%d valores pares\n",count);
    }
}

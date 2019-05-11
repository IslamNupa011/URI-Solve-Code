
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
public class Uri60 {
    public static void main(String[] args){
         double n;
         int i,count=0;
         Scanner sc=new Scanner(System.in);
         for(i=1;i<=6;i++){
             n=sc.nextDouble();
             if(n>0){
               count++; 
             }
         
         }
         System.out.printf("%d valores positivos\n",count);
    }
}


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
public class Uri75 {
     public static void main(String[] args){
         int n;
         int i;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         for(i=1;i<=10000;i++){
             
             if(i%n==2){
               System.out.println(i);
             }
         
         }
        
    }
}

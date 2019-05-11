
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
public class Uri70 {
    public static void main(String[] args){
         int n;
         int i,howmanyodd=6,odd;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        
         for(i=n;i<(n+(howmanyodd*2));i=i+2){
            if(i%2==0){
               odd=i+1;
               System.out.printf("%d\n",odd);
            }
            else{
              odd=i;
              System.out.printf("%d\n",odd);
            }
         
         }
         
    }
}

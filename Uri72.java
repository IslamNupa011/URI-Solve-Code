
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
public class Uri72 {
     public static void main(String[] args){
         int n,a,in=0,out=0,h;
         int i;
         Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
         for(i=1;i<=n;i++){
             a=sc.nextInt();
            
             if((a>=10)&&(a<=20)){
                    in++;
                
                  
             }
             else{
               out++;
             
             }
         }
            System.out.print(in+" in\n"+out +" out\n");
         
         
        
    }
}

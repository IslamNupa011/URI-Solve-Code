
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
public class Uri80 {
    public static void main(String[] args){
         int N = 100,i,X,highest=0,position=0;
         
         Scanner input=new Scanner(System.in);
      
           for (i = 1; i <= N; i++) {
                  X =input.nextInt();
                  if(highest>X){
                      highest=highest;
                      position=position;
                  
                  }
                  else{
                   highest=X;
                   position=i;
                  }
                }
           System.out.print(highest+"\n"+position+"\n");
           
         }
}

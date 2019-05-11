
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
public class Uri79 {
    public static void main(String[] args){
         int N;
         float a ,b ,c ,i,average;
         Scanner input=new Scanner(System.in);
          N =input.nextInt();
           for (i = 1; i <= N; i++) {
                   a =input.nextFloat();
                    b =input.nextFloat();
                     c =input.nextFloat();
                 average=(a*2 + b*3 + c*5)/10;
                  System.out.printf("%.1f\n",average);
                }
           
           
         }
}

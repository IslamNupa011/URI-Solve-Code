
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
public class Uri71 {
     public static void main(String[] args) {
  int X, Y, total = 0;
  Scanner input =new Scanner(System.in);
  X = input.nextInt();
  Y = input.nextInt();

  if (X > Y) {
   for (int i = X - 1; i > Y; i--) {
    if (i % 2 != 0) {
     total += i;
    }
   }
  }else {
   for (int i = Y - 1; i > X; i--) {
    if (i % 2 != 0) {
     total += i;
    }
   }
  }

  System.out.print(total+"\n");

 }

}

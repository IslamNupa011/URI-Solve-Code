

import java.io.IOException;
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
public class Uri45 {
    
    public static void main(String[] args) throws IOException {
 double A, B, C;
  Scanner input =new Scanner(System.in);
  A = input.nextDouble();
  B = input.nextDouble();
  C = input.nextDouble();
  double ta = Math.max(A, Math.max(B, C));
  double tb = 0;
  double tc = 0;
 
  if (ta == A) {
   tb =Math.max(B, C);
   tc =Math.min(B, C);
  }
  if (ta == B) {
   tb =Math.max(A, C);
   tc =Math.min(A, C);
  }
  if (ta == C) {
   tb =Math.max(B, A);
   tc =Math.min(B, A);
  }
  //------------------------------
  if (ta >= (tb + tc)) {
   System.out.print("NAO FORMA TRIANGULO\n");
   
  }else if (ta*ta > ((tb*tb)+(tc*tc))) {
   System.out.print("TRIANGULO OBTUSANGULO\n");
  }
  if (ta*ta == ((tb*tb)+(tc*tc))) {
   System.out.print("TRIANGULO RETANGULO\n");
  }
 
   if (ta*ta < ((tb*tb)+(tc*tc))) {
   System.out.print("TRIANGULO ACUTANGULO\n");
  }
  if ((ta == tb) &&(ta == tc)) {
   System.out.print("TRIANGULO EQUILATERO\n");
  }
  if (((ta == tb) &&(ta != tc)) || ((ta == tc) &&(ta != tb)) || ((tb == tc) &&(tb != ta)) ) {
   System.out.print("TRIANGULO ISOSCELES\n");
  }
 
    }
 
}


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
public class Uri114 {
     public static void main(String[] args){
         int password = 2002, givenPassword;

        Scanner input = new Scanner(System.in);


        while ((givenPassword = input.nextInt()) != password) {

            System.out.print("Senha Invalida\n");


        }


        System.out.print("Acesso Permitido\n");
         }
}

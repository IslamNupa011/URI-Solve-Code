
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
public class Uri142 {
    public static void main(String[] args){
        int N;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= (4*N - 1); i+=4) {

            for (int j = i; j <= i+2; j++) {

                System.out.print(j+" ");

            }

            System.out.print("PUM\n");

        }
    }
}

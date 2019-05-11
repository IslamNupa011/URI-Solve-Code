
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
public class Uri115 {
    public static void main(String[] args) throws IOException {

        int firstsign, secondSign;

        Scanner input = new Scanner(System.in);

        while (((firstsign = input.nextInt()) != 0) && ((secondSign = input.nextInt()) != 0)) {

            if (firstsign > 0 && secondSign > 0) {

                System.out.print("primeiro\n");

            } else if (firstsign > 0 && secondSign < 0) {

                System.out.print("quarto\n");

            } else if (firstsign < 0 && secondSign < 0) {

                System.out.print("terceiro\n");

            } else if (firstsign < 0 && secondSign > 0) {

                System.out.print("segundo\n");

            }

        }

    }
}

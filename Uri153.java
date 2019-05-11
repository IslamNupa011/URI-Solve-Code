
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
public class Uri153 {
    public static void main(String[] args) {
		int N, fact = 1;
		Scanner input =new Scanner(System.in);
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			fact *= i;
		}
		System.out.print(fact+"\n");

	}
}


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
public class Uri157 {
    public static void main(String[] args) {
		int N;
		Scanner input =new Scanner(System.in);
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i+"\n");
			}
		}

	}

}


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
public class Uri154 {
    public static void main(String[] args) {
		int age;
		int totalNum = 0,totalAge = 0;
		float ageAverage;
		Scanner input =new Scanner(System.in);
		int i =1;
		while (((age = input.nextInt()) >= 0)) {
			totalAge += age;
			totalNum += i;
		}
		ageAverage = (float)((float)totalAge / (totalNum));
		System.out.printf("%.2f\n",ageAverage);
	}
}

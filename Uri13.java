

import java.util.Scanner;


public class Uri13 {
    public static void main(String[] args){
           int x,y,z;
           
        
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
       if(x>y&&x>z){
		System.out.printf("%d eh o maior\n", x);
	}
	else{
		if(y>x&&y>z){
		System.out.printf("%d eh o maior\n", y);
		}
		else{
			if(z>x&&z>y){
				System.out.printf("%d eh o maior\n", z);
			}
		}
	}
    }
}

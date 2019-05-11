

import java.util.Scanner;



public class Uri19 {
    public static void main(String[] args){
        int a,hour,min,sec;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextInt();
           
            hour=(a/3600);
            min=((a%3600)/60);
            sec=(a%60);
            
            System.out.printf("%d:%d:%d\n",hour,min,sec);
            
    
    }
}

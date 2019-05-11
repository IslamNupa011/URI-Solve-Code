
import java.util.Scanner;


public class Uri20 {
    public static void main(String[] args){
     int a,b,n,year,month,day;
            Scanner sc=new Scanner(System.in);
         
            n = sc.nextInt();
           
            year=(n/365);
            a=n%365;
            b=a%30;
            month=(a/30);
            day=(b%30);
            
            System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, month, day);
            
            
            
            
}
}
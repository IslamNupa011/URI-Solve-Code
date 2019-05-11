
import java.util.Scanner;


public class Uri14 {
     public static void main(String[] args){
         int distance;
         double fuel,consumption;
            Scanner sc=new Scanner(System.in);
             distance = sc.nextInt();
             fuel = sc.nextDouble();
             
           consumption = (distance/fuel);
           System.out.printf("%.3f km/l\n", consumption);
     }
}

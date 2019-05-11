
import java.util.Scanner;


public class Uri8 {
     public static void main(String[] args){
      
         int NUMBER,WR ;
       float AMOUNT,SALARY;
               Scanner sc=new Scanner(System.in);
               
               NUMBER = sc.nextInt();
               WR = sc.nextInt();
               AMOUNT = sc.nextFloat();
                
               SALARY = WR*AMOUNT;
               
               System.out.printf("NUMBER = %d\n", NUMBER);
              
              System.out.printf("SALARY = U$ %.2f\n", SALARY);
}
}

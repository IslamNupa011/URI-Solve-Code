
import java.util.Scanner;


public class Uri9 {
      public static void main(String[] args){
      
        String name;
       double SALARY,TVALUE,TOTAL;
               Scanner sc=new Scanner(System.in);
               
               name = sc.nextLine();
               SALARY = sc.nextDouble();
               TVALUE = sc.nextDouble();
                
              TOTAL = SALARY + TVALUE * 0.15;
               
             
              
              System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
}
}

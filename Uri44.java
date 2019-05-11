
import java.util.Scanner;


public class Uri44 {
     public static void main(String[] args){
        int a,b;
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextInt();
             b = sc.nextInt();
           
            if((a%b==0)||(b%a==0)){
               
               System.out.printf("Sao Multiplos\n");
           
           }
            
           else{
              System.out.printf("Nao sao Multiplos\n");
              
           }
            
    
    }
}


import java.util.Scanner;


public class Uri38 {
    public static void main(String[] args){
         
         int a,b;
         
            Scanner sc=new Scanner(System.in);
         
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(a==1){
            
            System.out.printf("Total: R$ %.2f\n",b*4.00);
            
            }
            else
                if(a==2){
                    System.out.printf("Total: R$ %.2f\n",b*4.50);
                }
                else 
                    if(a==3){
                     System.out.printf("Total: R$ %.2f\n",b*5.00);
                    }
                else 
                    if(a==4){
                     System.out.printf("Total: R$ %.2f\n",b*2.00);
                    }
                 else 
                    if(a==5){
                     System.out.printf("Total: R$ %.2f\n",b*1.50);
                    }  
            
            
     }
}

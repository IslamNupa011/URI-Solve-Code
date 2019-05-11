
import java.util.Scanner;


public class Uri46 {
     public static void main(String[] args){
        int stime,etime,difference;
            Scanner sc=new Scanner(System.in);
         
            stime = sc.nextInt();
            etime = sc.nextInt();
            
            difference = etime-stime;
            if(difference<0){
               difference=24+difference;
            }
            if(difference==0){
              System.out.println("O JOGO DUROU 24 HORA(S)");
            }
            else{
               System.out.printf("O JOGO DUROU %d HORA(S)\n",difference);
            }
             
     }          
}

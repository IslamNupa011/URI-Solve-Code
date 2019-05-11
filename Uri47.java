
import java.util.Scanner;


public class Uri47 {
     public static void main(String[] args){
        int stimehour,etimehour,stimeminit,etimeminit,duration_h,duration_m;
            Scanner sc=new Scanner(System.in);
         
            stimehour = sc.nextInt();
             stimeminit = sc.nextInt();
            etimehour = sc.nextInt();
          
            etimeminit = sc.nextInt();
            
            duration_h = etimehour - stimehour;

                  if (duration_h < 0)
                       {
                           duration_h = 24 + (etimehour-stimehour);
                          }

                       duration_m = etimeminit - stimeminit;
                 if (duration_m < 0)

                    {
                      duration_m = 60 + (etimeminit - stimeminit);
                    duration_h--;
                       }
            
            if((duration_h==0)&&(duration_m==0)){
              System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            else{
               System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duration_h,duration_m);
            }
     }
}

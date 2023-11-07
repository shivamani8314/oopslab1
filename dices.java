import java.lang.*;
import java.util.*;

public class dices{

       public static void main(String[] args)
           {
             Scanner input=new Scanner(System.in);
                int x,y;
                   int sum=0,i=0;
            while(i<10)
              {
                     x=input.nextInt();
                   y=input.nextInt();
                       if(x==y)
                         {sum++;}
                       i++;
                          
              }
  System.out.println(sum);
           
             }
}


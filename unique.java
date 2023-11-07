import java.lang.*;
import java.util.*;

public class unique{

       public static void main(String[] args)
           {
             Scanner input=new Scanner(System.in);
                Set<Integer> data = new HashSet<Integer>();
              int x;

               while(data.size()<5)
               {  
                   x=input.nextInt();

                  if(x>=10 && x<=100)
                    data.add(x);
                       }
            System.out.println(data);
           
             }
}


import java.util.*;
import java.lang.*;

public class Linear{
     public static void main(String[] args)
{  Scanner input=new Scanner(System.in);
    int[] arr={1,2,3,5};
     int i,f=1;
   int s=input.nextInt();
 for(i=0;i<arr.length;i++)
{
   if(s==arr[i])
{
 
  f=0;
break;
}

}

if(f==1)
{
System.out.println("element not found");
  }
else
{
System.out.println("element found");
}

}

}


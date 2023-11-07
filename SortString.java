import java.util.*;
import java.lang.*;

public class SortString{
     public static void main(String[] args)
{  Scanner input=new Scanner(System.in);
    
    String[] s1=new String[3];
    String[] s2=new String[3];
   int i,j;
for(i=0;i<3;i++)
{
  s1[i]=input.next();

}
String temp;

for(i=0;i<3-1;i++)
{
     for(j=0;j<3-i-1;j++)
{
        if((s1[j].compareTo(s1[j+1]))>0)
{
  temp=s1[j];
s1[j]=s1[j+1];
s1[j+1]=temp;
}
}

}

for(i=0;i<3;i++)
{
  System.out.println(s1[i]);

}
}

}


import java.util.*;
import java.lang.*;

public class strvowel{
     public static void main(String[] args)

{

   Scanner input=new Scanner(System.in);
  String s1="hello";
int v=0,c=0;
for(int i=0;i<s1.length();i++)
   {  
      if(s1.charAt(i)=='a' || s1.charAt(i)=='e')
     {    v++;
        }
     
else{
    c++;
}
}
 System.out.println(v+"  "+c);
System.out.println("not for capital and all vowels");

   }


}

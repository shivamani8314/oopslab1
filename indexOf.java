import java.util.*;
import java.lang.*;

public class indexOf{
     public static void main(String[] args)

{

   Scanner input=new Scanner(System.in);
    String s1=input.nextLine();
 int j=0,c=0;
    for(int i=0;i<s1.length();i++)
   {
   if(j<s1.length() && s1.indexOf("l",j)!=-1)
    {
      c=c+1;
      j=s1.indexOf("l",j)+1;
        }
  else{
  break;
}

}
 System.out.println(c);



   }


}

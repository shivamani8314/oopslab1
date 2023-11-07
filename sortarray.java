import java.util.*;
import java.lang.*;
public class sortarray{

public static void main(String[] args)

{
     Scanner input=new Scanner(System.in);
   System.out.println("enter the size of an array");
  int n=input.nextInt();
     int[] arr=new int[n];
      int i;
  for(i=0;i<n;i++)
{
   arr[i]=input.nextInt();

}

  Arrays.sort(arr);
  for(i=0;i<n;i++)
{
   System.out.println(arr[i]);
}



}


}

import java.util.*;
import java.lang.*;

public class array{
     public static void main(String[] args)
{  Scanner input=new Scanner(System.in);
       int arr[]={6,9,7,8,5};
Arrays.sort(arr);
System.out.println(arr[0]);
System.out.println(arr[arr.length-1]);
      int[] a= new int[10];
     for(int i=0;i<5;i++)
{
     a[i]=input.nextInt();
}

 for(int j=0;j<5;j++)
{
    System.out.println(a[j]);
}
}
}

import java.util.*;
import java.lang.*;

public class MultiMatrix{
     public static void main(String[] args)
{  Scanner input=new Scanner(System.in);
    

      int[][] a= new int[10][10];
      int[][] b=new int[10][10];
      int i,j,m,n,m1,n1;
System.out.println("enter m n");
m=input.nextInt();
n=input.nextInt();

System.out.println("enter m1 n1");
m1=input.nextInt();
n1=input.nextInt();
 for(i=0;i<m;i++)
{  for(j=0;j<n;j++)
   {
     a[i][j]=input.nextInt();
   }
}


for(i=0;i<m;i++)
{  for(j=0;j<n;j++)
   {
    System.out.println(a[i][j]);
   }
}

for(i=0;i<m1;i++)
{  for(j=0;j<n1;j++)
   {
     b[i][j]=input.nextInt();
   }
}

multiMatrix(a,b,m,n,m1,n1);

}

static void multiMatrix(int[][] a,int[][] b,int m,int n,int m1,int n1)
{int i,j,k;
int[][] c= new int[10][10];

     for(i=0;i<m;i++)
{  for(j=0;j<n1;j++)
   {

    for(k=0;k<m1;k++)

     c[i][j]+=a[i][k]*b[k][j];
   }
}



for(i=0;i<m;i++)
 { System.out.println();
for(j=0;j<n1;j++)
   {
    System.out.print(c[i][j] + " ");
   }
}

}


}

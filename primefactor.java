import java.util.Scanner;
public class primefactor{
  
          static void factor(int a)
{
         int i;
         for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
              prime(i);
              }

         }
}

  static int noOfFactors(int g)
        {
             
         int j,c=2;
         for(j=2;j<g;j++)
        {
            if(g%j==0)
            {
            c++;
              }

         }
return c;

          }

static void prime(int b)
{
       int k=noOfFactors(b);
   if(k==2)
{
System.out.println(b);

}

}
    

      public static void main(String[] args)
{    Scanner input=new Scanner(System.in);
int n;
n=input.nextInt();
     factor(n);

}
}

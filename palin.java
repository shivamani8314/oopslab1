public class palin{
     public static void main(String[] args)
{
       int a=121;

int sum=0;
int r;
      while(a>0)
{
    r=a%10;
  a=a/10;
sum=sum*10+r;
}
System.out.println(sum);
}
}

import java.util.Scanner;
public class calc{


               static void cal(int a,int b,char c)
            {
                    if(c=='+')
                  {     add(a,b);
                }
                  if(c=='-')
              {
                       sub(a,b);
              }
                    if(c=='*')
                   {
                       mul(a,b);
                  
}
            }

     static void add(int a,int b)
{

System.out.println(a+b);
}
         
  static void sub(int a,int b)
{

System.out.println(a-b);
}

  static void mul(int a,int b)
{

System.out.println(a*b);
}




      
               public static void main(String[] args)
            {   
            Scanner input= new Scanner(System.in);
     int p,m;
char u;
          p=input.nextInt();
m=input.nextInt();
u=input.next().charAt(0);
cal(p,m,u);
             cal(30,10,'+');
             cal(30,10,'-');
              cal(30,10,'*');
            
              }   
}


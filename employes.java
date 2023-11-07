import java.lang.*;
import java.util.*;
 class employe
{
   int age;
   String name,gender;
   
    
    void sName(String name)
         {

           this.name=name;

          }

    void gName()
         {

        System.out.println(name);
          }



void sgender(String gender)
         {

           this.gender=gender;

          }

    void ggender()
         {

        System.out.println(gender);
          }

void sage(int age)
         {

           this.age=age;

          }

    void gage()
         {

        System.out.println(age);
          }

}
public class employes{
       public static void main(String[] args)
        {
     employe emp1=new employe();
     emp1.sName("john");
      emp1.sgender("male");
      emp1.sage(20);
          
       emp1.gName();
      emp1.ggender();
      emp1.gage();
      System.out.println(emp1.name);
       System.out.println(emp1.name.hashCode());

          }


}

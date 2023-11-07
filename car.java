import java.util.*;
import java.lang.*;
public class car{


   public static void main(String[] args)
      {
          Scanner input=new Scanner(System.in);
         double fuelconsumption,time;
          carDetails c1=new carDetails("ford","black",22,50);
          carDetails c2=new carDetails("ford","black",33,25);
          carDetails c3=new carDetails("ford","black",44,60);
}


}


class carDetails{

        String company,color;
        double mileage,speed;
       
     carDetails(String company,String color,double mileage,double speed)
      {
          this.company=company;
          this.color=color;
           this.mileage=mileage;
           this.speed=speed;
      }
 double getmileage()
  {
   return mileage;
  }
double getspeed()
{
  return speed;
}
}


import java.util.*;
import java.lang.*;
public class lampLight{


   public static void main(String[] args)
      {
          Scanner input=new Scanner(System.in);
  //     System.out.println("status");
         Lamp l1=new Lamp("led",true);
         Lamp halogen=new Lamp("halogen",true);
     Lamp l3=new Lamp("l3",true);
System.out.println(l1.turnOff());
System.out.println(halogen.turnOff());
System.out.println(l3.turnOff());

        
      }         

}



 class Lamp{
     String lamptype;
    
   boolean isOn;
   Lamp(String lamptype,boolean isOn)
     { 
       this.lamptype=lamptype;
        this.isOn=isOn;
     }

String turnOff()
   { 

          if(isOn==true)
       {      isOn=false;
              return "turned off";
      }
           return "already off";
   }
String turnOn()
{ 
         if(isOn==false)
       {   isOn=true;
        return "turned on";  
       }

        return "already on";
  }

  
}

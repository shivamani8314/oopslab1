import java.util.*;
import java.lang.*;
public class television{


   public static void main(String[] args)
      {
          Scanner input=new Scanner(System.in);
             tv t1=new tv();
             tv t2=new tv();
       t1.setvolume(5);
       t2.setvolume(7);
       t1.volumedown();
       t2.volumedown();



        
      }

  
}

class tv{
        
 
     int channel,volume;
         boolean on=true;


  void turnOn(){
      if(on==false)
         on=true;
 }

void turnOff()
{
    if(on==true)
      on=false;

}

 void setChannel(int newChannel){
 if(on==true)  
  { if(newChannel>=1 && newChannel<=40)
          {
           channel=newChannel; 
          }    
} 
}
void setvolume(int newvolume){
    if(on==true)
    {  if(newvolume>=1 && newvolume<=7)
          {
           volume=newvolume; 
          }  
}   
}



void channelup(){
if(channel<39)
   {channel++;
  }
}

void channeldown(){
if(channel>1)
   {channel--;
  }
}
void volumeup(){
if(volume<7)
   {volume++;
   System.out.println(volume);
  }
}
void volumedown(){
if(volume>1)
   {volume--;
  }
   System.out.println(volume);
}








}

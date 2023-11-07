import java.util.*;
import java.lang.*;
public class areaAndPerimeter{


   public static void main(String[] args)
      {
          Scanner input=new Scanner(System.in);
       System.out.println("enter the radius of a circle");
          circle c1=new circle(input.nextInt());
          double area=c1.getArea();
          double perimeter=c1.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);
  
        System.out.println("enter the radius of a circle");
          circle c2=new circle(input.nextInt());
           area=c2.getArea();
           perimeter=c2.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);
	System.out.println("enter the radius of a circle");
          circle c3=new circle(input.nextInt());
           area=c3.getArea();
           perimeter=c3.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);

      }         

}



class circle{
   static double radius;
      circle(double radius)
      { 
       this.radius=radius;  
       }
  static double getArea()
     {
        return 3.14*radius*radius; 
     }

   static double getPerimeter()
     {  
        return 2*3.14*radius;
   }
  
}

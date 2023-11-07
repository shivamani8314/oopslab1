import java.lang.*;
import java.util.*;
class product{
     double price;
     int id,quantity;
      String name;
     
     product(double price,int id,String name,int quantity)
         {
            this.price=price;
             this.id=id;
              this.name=name;
                 this.quantity=quantity;

            }
  void productDetails()
          {
               System.out.println(id);
               System.out.println(name);
               System.out.println(price);                                       
             	System.out.println(quantity);
                }

       double retail()
        {
           return price*quantity;
         }

}
public class mailOrder{
            public static void main(String[] args)
             {
                        product p1=new product(99.90,1,"product1",5);
                        product p2=new product(20.20,2,"product2",4);
                        product p3=new product(6.87,3,"product3",3);
                        product p4=new product(45.50,4,"product4",2);
                        product p5=new product(40.49,5,"product5",1);


                        Scanner input=new Scanner(System.in);
                        int i;
         
          
		System.out.println(" Please Enter your Choice : ");
		System.out.println("1:  Product 1 Stats ");
		System.out.println("2:  Product 2 Stats ");
		System.out.println("3:  Product 3 Stats ");
		System.out.println("4:  Product 4 Stats ");
		System.out.println("5:  Product 5 Stats ");
		System.out.println("6:  Total Quantities sold ");
		System.out.println("7:  Exit  ");
		
		System.out.println("Enter your Choice: ");
		
  i=input.nextInt();
		switch(i)
		{
			case 1: 
				     p1.productDetails();
					break;
				
			case 2:
					p2.productDetails();
					break;
			case 3:
					p3.productDetails();
					break;
			case 4:
					p4.productDetails();
					break;
			case 5:
					p5.productDetails();
					break;
			case 6:
					double d=p1.retail()+p2.retail()+p3.retail()+p4.retail()+p5.retail();
					System.out.println(d);
					break;
			case 7:
					break;
			
}
}
}

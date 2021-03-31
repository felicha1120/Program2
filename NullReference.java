package Modul2;

import java.awt.Rectangle;


public class NullReference {
	 private static Rectangle rectangle;

	  
	  public static int area() {
		  return area();
	  }
	  
	 public static void main(String[] args) {
		 
		 if(rectangle == null) {
	 System.out.println("rectangle variable doesn’t refer to a Rectangle object");
	 
	 } else {
		 
	 int area = NullReference.area();
	 System.out.println("Area: " + area);
	 }
		 
 }
	 
}
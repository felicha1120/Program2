package Modul2;

import java.awt.Rectangle;


public class WrongCasting {
	 public static void main(String[] args) {
		 
	 Object rectangle = new Rectangle(10,10);
	 String str = (String) rectangle;
	 System.out.println("String str : " + str);

	 
	/* try {
		 System.out.println("String str : " + str);
	 } catch (Exception e) {
		 System.err.println(e);
	 }
	 
	 System.out.println("Akhir program");
	 */
	 
	 }
	
}
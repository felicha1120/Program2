package Modul2;

import java.awt.Rectangle;

public class doSomething {
	
	public void doSomething() {
		try {
		 Object object = new Rectangle();
		 String string = (String)object;
		 
		 } catch(RuntimeException re) {
			 
		 System.out.println("RuntimeException");
		 }
		
		
	 } 
	
	
}



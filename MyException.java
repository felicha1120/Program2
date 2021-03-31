package Modul2;

import java.awt.Rectangle;

public class MyException extends ClassCastException {
	public MyException() {
		super("MyException");
	}
	
	
 	}
		 class MyClass {
			public void doSomething() {
				try {
					Object object = new Rectangle();
					String string = (String)object;
 
				} catch(MyException me) {
					System.out.println("catching MyException");
				} finally {
					System.out.println("executing finally block");
 }
				
 }
			
 }
		

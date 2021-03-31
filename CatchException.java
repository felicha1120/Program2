package Modul2;

public class CatchException {
	public void doSomething() {
		try {
			int i = 1/0;
		} catch(Throwable throwable) {
			
			System.out.println("catching java.lang.Throwable exception");
 }
		
 }
	
 } 

package myPack;

public class ComputerAccessException extends Exception {
	
	public ComputerAccessException() { 
       System.out.println("”You can't use this program because computer is off”");
     
     System.out.println("Computer starts anh have parameters: " + WorkingComputer.pc1.toString());

try {
		WorkingComputer.turnOn();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    } 

}

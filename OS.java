package myPack.wcWithMyExeption;
import java.util.Scanner;

public class OS {

	static void startOS() throws Exception{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println(" If you Want start OS please enter 1, if not - 2 ");
		
		switch (sc.nextInt()) {
            case 1:
                System.out.println("-- OS started");
                try{
                	workWithCalculatorAndFileManager();
                }catch (ComputerAccessException me1) {
                	System.err.print(me1);
				}
                break;
            case 2:
                System.out.println("-- OS not started");
				WorkingComputer comp = new WorkingComputer();
				comp.turnOn();
                break;
            default: 
                System.out.println("You choise is wrong, please enter 1 or 2");
				startOS();
                break;
        }
	}	
	
	static void workWithCalculatorAndFileManager() throws ComputerAccessException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println(" If you Want lunch Calculator please enter 1, if - FileManager - 2 ");
		
		switch (sc.nextInt()) {
        case 1:
            CalculatorWithSwitch runCalc = new CalculatorWithSwitch();
            	runCalc.workCalc();
            break;
        case 2:
            try {
				FileManager.copyFileText();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            break;
        default: 
            System.out.println("You choise is wrong, please enter 1 or 2");
			try {
				startOS();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            break;
		}
	}
}

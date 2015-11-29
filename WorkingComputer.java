package myPack.wcWithMyExeption;

import java.util.Scanner; 
import java.io.*;
import java.io.IOException;

class WorkingComputer {
	static Computer pc1;
	
	static void turnOn()throws Exception{
		System.out.println("--------------------------------------------------");
		System.out.println("If you Want turn PC please enter 1, if not - 2 ");
		
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
            case 1:
            	//pc1 = new Computer(300,1024,"Asus","Gygabyte");
            	//pc1.powerSwitch(1);
        		//System.out.println("Computer starts anh have parameters: " + pc1.toString());
        		if(pc1!=null) {
				WorkingComputer comp = new WorkingComputer();
				comp.installOS();
        		}else {
        			 throw new ComputerAccessException("”You can't use this program because computer is off”");
                }
                break;
            case 2:
            	pc1 = new Computer(300,1024,"Asus","Gygabyte");
            	pc1.powerSwitch(2);
                break;
            default: 
                System.out.println("You choise is wrong, please enter 1 or 2");
				turnOn();
                break;
        }
    }

	void installOS()throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println(" If you Want install OS please enter 1, if not - 2 ");
		
		switch (sc.nextInt()) {
            case 1:
                System.out.println("-- OS installed successfully");
				OS.startOS();
                break;
            case 2:
                System.out.println("-- PC is turning off");
                break;
            default: 
                System.out.println("You choise is wrong, please enter 1 or 2");
				installOS();
                break;
        }
	}
}
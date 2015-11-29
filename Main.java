package myPack.wcWithMyExeption;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{ 
		try{
			WorkingComputer comp = new WorkingComputer();
			comp.turnOn();
		}catch (ComputerAccessException me1){
			System.err.print(me1);
			WorkingComputer.pc1 = new Computer(300,1024,"Asus","Gygabyte");
			WorkingComputer.pc1.powerSwitch(1);
    		System.out.println("Computer starts and have parameters: " + WorkingComputer.pc1.toString());
    		WorkingComputer comp = new WorkingComputer();
			comp.turnOn();
		}
	}
}

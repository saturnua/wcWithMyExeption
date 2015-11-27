package myPack;
import java.util.Scanner;

public class CalculatorWithSwitch {
	public static int getOperation(String operation) {

        int operationNumber = 0;

        if (operation == null) {
            return operationNumber;
        }

        switch (operation) {
            case "+":
                operationNumber = 1;
                break;
            case "-":
                operationNumber = 2;
                break;
            case "/":
                operationNumber = 3;
                break;
            case "*":
                operationNumber = 4;
                break;
            
            default: 
                operationNumber = 0;
                break;
        }

        return operationNumber;
    }
	
	public double getSum(double operand1, double operand2){
			double result = operand1 + operand2;
			return result;
	}

    void workCalc() {
		
		System.out.println("Vvedite dannie cherez probel v vide  __chislo1__ operation __chislo2__ Example: 10 + 23, esli chislo drobnoe vvedite cherez \".\" Example: 10.01 + 23.005");
		System.out.println();
        Scanner in = new Scanner(System.in);
		
		String operand1 = in.next();
		String operation = in.next();
		String operand2 = in.next();
		
		in.close();
		
		int typeOperation = getOperation(operation);
	
		
		switch(typeOperation) {
			case 1: 
			
				CalculatorWithSwitch calcSum = new CalculatorWithSwitch();                                   //Создаем экземпляр класса
				double res = calcSum.getSum(Double.parseDouble(operand1),Double.parseDouble(operand2));		//Вызываем метод getSum
				
				System.out.println();
				if(operand1.contains(".") || operand2.contains(".")){
					System.out.println(Double.parseDouble(operand1) + " + " + Double.parseDouble(operand2) + " = " + res);
				} else {
					System.out.println(Integer.parseInt(operand1) + " + " + Integer.parseInt(operand2) + " = " + res);
				}
					
				break;
				
			case 2: 
				res = Double.parseDouble(operand1) - Double.parseDouble(operand2);
				System.out.println();
				
				if(operand1.contains(".") || operand2.contains(".")){
					System.out.println(Double.parseDouble(operand1) + " - " + Double.parseDouble(operand2) + " = " + res);
				} else {
					System.out.println(Integer.parseInt(operand1) + " - " + Integer.parseInt(operand2) + " = " + res);
				}
				break;
				
			case 3: 
				if(Double.parseDouble(operand2) == 0){
					System.out.println("Na nol delit nelzya");
					break;
				}
				else{
					res = Double.parseDouble(operand1) / Double.parseDouble(operand2);
					System.out.println();
				if(operand1.contains(".") || operand2.contains(".")){
					System.out.println(Double.parseDouble(operand1) + " / " + Double.parseDouble(operand2) + " = " + res);
				} else {
					System.out.println(Integer.parseInt(operand1) + " / " + Integer.parseInt(operand2) + " = " + res);
				}
					break;
				}
				
			case 4: 
				res = Double.parseDouble(operand1) * Double.parseDouble(operand2);
				System.out.println();
				if(operand1.contains(".") || operand2.contains(".")){
					System.out.println(Double.parseDouble(operand1) + " * " + Double.parseDouble(operand2) + " = " + res);
				} else {
					System.out.println(Integer.parseInt(operand1) + " * " + Integer.parseInt(operand2) + " = " + res);
				}
				break;	
				
			default: 
                System.out.println("Fatal Error :)");
                break;
		}
     
    }
}

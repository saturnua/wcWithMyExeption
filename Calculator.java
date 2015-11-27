package myPack;

public class Calculator {
	private int x;                   
	private int y;					
	private int [] massive;			
	private String [][] resultTable; 

		Calculator(int x, int y){
			this.x = x;
			this.y = y; 
		}
		
		Calculator(int [] massive){  
			this.massive = massive;
		}
		
		Calculator(String [] [] resultTable){  
			this.resultTable = resultTable;
		}

	public int getSum(){
			int result = this.x + this.y;
			return result;
	}
	
	public void sumResult(){
		System.out.println(getSum());
	}
	
	public double sqrtResult(){
		double sqrt = Math.sqrt(getSum());	
		return sqrt;						
	}
	
	public double sinResult(){
		double sin = Math.sin(getSum());	
		return sin;							
	}
	
	public void getMax(){				
		int max = this.massive[0];
		
		for(int i : this.massive){
			if(i > max){
				max = i;
			}
		}
		System.out.println(max);
	}
	

	/*public static void main(String[] args){
		
		Calculator calc = new Calculator(3,4);
		
		int [] mas = {1,4,5,107,8,9,99,44,-4,66};
		Calculator masive = new Calculator(mas);
		
		
		String [][] resTable = new String[3][2];
		
		resTable[0][0] = "Summa";
		resTable[0][1] = Integer.toString(calc.getSum());
		
		resTable[1][0] = "Sqrt";
		resTable[1][1] = Double.toString(calc.sqrtResult());
		
		resTable[2][0] = "Sin";
		resTable[2][1] = Double.toString(calc.sinResult());
		
		Calculator mnogoMas = new Calculator (resTable);	
		
		for(int i = 0; i < 3; i++){							
			for(int j = 0; j < 2; j++){						
				System.out.print(resTable[i][j] + "  ");	
			}	
			System.out.println();							
		}
		
		
		
	}*/
}

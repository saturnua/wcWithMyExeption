package myPack.wcWithMyExeption;

public class Computer {
	int powerSuply;   
	int ram; 
	
	String mainboard; 
	String videocard; 
	
	Computer (int powerSuply,int ram, String mainboard,String videocard){
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
	}
	
	
	void powerSwitch(int state){  //state - ��������� �����������
			if(state == 1){
				System.out.println("Switch turn on");
			}
			else{
				System.out.println("Switch turn off");
			}
		}
		
	 @Override
    public String toString()
    {
        return "Computer powered "+this.powerSuply+" Watt power supply, "+" it has "+this.ram+" Mb RAM "+ ", and also it buld on "+this.mainboard+" mainboard and videocard by "+this.videocard;
    }
	
}

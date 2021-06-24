
public class AirconMain {

	public static void main(String[] args) {
		AirCon air = new AirCon();
		air.powerOnOff();
		air.powerOnOff();
		air.powerOnOff();
		air.powerOnOff();
		
		
		for(int i = 0;i<15;i++)
			air.tempUp();
		
//		air //pirvate로 설정된 변수는 외부에서 변경할 수 없다.
		for(int i = 0;i<15;i++)
			air.tempDown();
		
		for(int i = 0;i<13;i++)
			air.timerOn();
		
		for(int i = 0;i<7;i++)
			air.windpowerOn();
		


	}

}

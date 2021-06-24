
public class AirCon {
	//에어컨 제어용
	// 전원
	boolean power;
	// 모드
	String mode;
	// 바람세기
	int windpower;
	// 시간예약
	double timer;
	// 온도조절
	int temp;
	//
	int deg;
	//
	final int MIN_TEMP = 18;
	final int MAX_TEMP = 30;
	public AirCon(boolean power, String mode, int windpower, double timer, int temp, int deg) {
		super();
		this.power = power;
		this.temp = temp;
		this.windpower = windpower;
		this.mode = mode;
		this.timer = timer;
		this.deg = deg;
	}
	
	public AirCon() {
		super();
		power = false;
		temp = 24;
		windpower = 1;
	}
	
	//에어컨 전원 on/off 기능 , true 전원 on, false 전원 off
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원이 켜졌습니다.");
		else
			System.out.println("에어컨 전원이 꺼졌습니다.");
	}

	
	//에어컨 온도를 올리는 기능
	void tempUp() {
		//전원이 켜져 있을때만 동작하게끔 설정
		if(!power) return;
		if(temp == MAX_TEMP) 
				return;
		else
			temp++;
			System.out.println("현재온도 : " +temp);

		}
	//에어컨 온도를 내리는 기능
	void tempDown() {
		if(!power) return;
		if(temp >MIN_TEMP) 
			temp--;
		System.out.println("현재온도 : " +temp);

		}
	
	//타이머 : 30분 단위로 지정이 가능, 최대 4시간까지 지정 가능
	//			 누를때마다 30분씩 증가
	void timerOn() {
		timer += 0.5;
		if(timer > 4) {
			timer = 0;
			System.out.println("타이머 해제");
		}else {
			System.out.println(timer + "시간 뒤 종료");
		}
	}
	
	// 바람세기: 1,2,3,자동-> 데이터는 계속 순환
	/*
	 * 바람세기 : 1
	 * 바람세기 : 2
	 * 바람세기 : 3
	 * 바람세기 : 자동
	 * 바람세기 : 1
	 * 	 
	 */
	void windpowerOn() {
		windpower += 1;
		if(windpower < 4) {
			System.out.println("바람세기 : " + windpower);
		}else if(windpower ==4){
			System.out.println("바람세기 : 자동");
		}else {
			windpower = 0;
			
		}
	}
	
}

	



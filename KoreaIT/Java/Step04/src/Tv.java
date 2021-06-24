
public class Tv {
	// 전원
	boolean power;
	// 채널
	int channel;
	// 음량
	int sound;
	// 음소거
	boolean mute;

	final int MIN_channel = 1;
	final int MAX_channel = 789;
	final int MIN_sound = 0;
	final int MAX_sound = 30;
	
	public Tv(boolean power, int channel, int sound, boolean mute) {
		super();
		this.power = power;
		this.channel = channel;
		this.sound = sound;
		this.mute = mute;
	}
	public Tv() {
		power = false;
		channel = 7;
		sound = 10;
		mute = false;
	}
	// TV전원 on/off
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원이 켜졌습니다.");
		else
			System.out.println("TV 전원이 꺼졌습니다.");
	}
	// 채널 올리는 기능
	void channelUp() {
		if(!power) return;
		channel++;
		if(channel > MAX_channel) {
			channel = MIN_channel;
			System.out.println("현재채널 : "+ channel);
		}else
			System.out.println("현재채널 : "+ channel);
			
	}
	// 채널 내리는 기능
	void channelDown() {
		if(!power) return;
		channel--;
		if(channel < MIN_channel) {
			channel = MAX_channel;
			System.out.println("현재채널 : "+ channel);
		}else {
		System.out.println("현재채널 : "+ channel);
		}
			
	}
	//음소거 기능
	void muteOnOff() {
		if(!power) return;
		mute = !mute;
		if(mute) {
			System.out.println("음소거");
		}else {
			System.out.println("음소거 해제");
			System.out.println("현재 음량 : " + sound);
		}
	}
	// 음량 올리는 기능
	void soundUp() {
		if(!power) return;
		sound++;
		if(sound > MAX_sound) {
			sound = 0;
		}System.out.println("현재음량 : "+ sound);
		if(mute) {
			System.out.println("현재음량 : "+ sound);
		}
		
	}
	// 음량 내리는 기능
	void soundDown() {
		if(!power) return;
		sound--;
		if(sound < MIN_sound) {
			sound = 0;
		}System.out.println("현재음량 : "+ sound);
		if(mute) {
		System.out.println("현재음량 : "+ sound);
		}
	}
}



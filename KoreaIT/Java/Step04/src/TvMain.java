
public class TvMain {

	public static void main(String[] args) {
		Tv tube = new Tv();
		tube.powerOnOff();
		tube.powerOnOff();
		tube.powerOnOff();
		
		for(int i = 0; i<999; i++)
			tube.channelDown();
		tube.muteOnOff();
		tube.muteOnOff();
		
		for(int i = 0; i<30; i++)
			tube.soundDown();
		for(int i = 0; i<50; i++)
			tube.soundUp();

	}

}

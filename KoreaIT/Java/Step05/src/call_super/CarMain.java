package call_super;

public class CarMain {

	public static void main(String[] args) {
		AICar car = new AICar(100,"A0010101");
		
		car.run();
		car.changeMode();
		car.changeMode();
		car.changeMode();

	}

}

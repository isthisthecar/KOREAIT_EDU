package inheritance;
//상속받을 클래스를 extends를 이용하여 연결
public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog Constructor");
	}
	
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}
}

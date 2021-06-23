
public class SwitchEx {
// 정수로, 문자로 되어있는 경우, 데이터가 정해져있는 경우, switch,case 
	public static void main(String[] args) {
		int n = 4;
		
		switch(n) {
		case 4:
			System.out.println("four");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 1:
			System.out.println("One");
			break;
		default:
			System.out.println("none");
		}
	}

}

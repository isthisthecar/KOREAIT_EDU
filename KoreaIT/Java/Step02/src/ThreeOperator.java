import java.util.Scanner;

public class ThreeOperator {

	public static void main(String[] args) {
		//숫자 입력 
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		String result = n % 2 == 0 ? "입력하신 숫자는 짝수입니다." : "입력하신 숫자는 홀수입니다.";
		System.out.println(result);
	}

}

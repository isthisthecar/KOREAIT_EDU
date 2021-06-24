
public class Calculator {
	//간단한 계산기 클래스 만들기
	int addCount;
	int subCount;
	int mulCount;
	int divCount;
	
	// 정수 두개를 받아서 덧셈결과를 정수로 되돌려주는 덧셈 기능
	int sum(int n1, int n2) {
		addCount++; // 실행한 메서드 횟수 증가
		return n1 + n2;
	}
		//리턴 뒤로는 보통 코드가 없음
	
		// 정수 두개를 받아서 뺄셈과를 정수로 되돌려주는 뺄셈 기능
	int sub(int n1, int n2) {
		subCount++;
		return n1 - n2;
	}
		
	// 정수 두개를 받아서 덧셈결과를 정수로 되돌려주는 덧셈 기능

	int mul(int n1, int n2) {
		mulCount++;
		return n1 * n2;
	}
	
	// 정수 두개를 받아서 덧셈결과를 정수로 되돌려주는 덧셈 기능
	int div(int n1, int n2) {
		divCount++;
		return n1 / n2;
		
	}
	void printcalccount() {
		System.out.println("덧셈 횟수 : "+addCount);
		System.out.println("뺼셈 횟수 : "+subCount);
		System.out.println("곱셈 횟수 : "+mulCount);
		System.out.println("나눗셈 횟수 : "+divCount);
	}
}	

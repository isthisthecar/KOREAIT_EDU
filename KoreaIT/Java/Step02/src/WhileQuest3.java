import java.util.Scanner;

public class WhileQuest3 {

	public static void main(String[] args) {
		//숫자 5개를 입력 받아서
		//입력한 숫자들의 평균을 출력
		//단 평균 결과는 소수점도 출력 
		Scanner sc = new Scanner(System.in);
		int i = 0;
		float n, total=0, avg = 0;
		while(i<5) {
			System.out.print("숫자를 입력하세요 : ");
			n = sc.nextFloat();
			total +=n;
			avg = total / 5;
			i++;
		}
		System.out.println("평균값은 "+ avg +"입니다.");

	}

}

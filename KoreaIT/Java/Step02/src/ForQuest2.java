import java.util.Scanner;

public class ForQuest2 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받으면 1부터 해당 숫자까지 합을 출력
		Scanner sc = new Scanner(System.in);
		int n;
		int total = 0;
		System.out.print("숫자를 입력하세요 : ");
		n =sc.nextInt();
		for(int i = 1; i<=n;i++) {
			total +=i;
		}
		System.out.println(total);
		

	}

}

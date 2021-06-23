import java.util.Scanner;

public class WhileQuest2 {

	public static void main(String[] args) {
		// 숫자 두개를 입력 받은후
		// 첫번째 입력한 숫자부터 두번째 입력한 숫자까지 합을 출력
		// 5 10을 입력할시 : 45
		Scanner sc = new Scanner(System.in);
		int n,i,sum=0;
		System.out.print("첫번째 숫자를 입력하세요 : ");
		n = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		i = sc.nextInt();
		while(n<=i) {
			sum += n;
			n++;
		}
		System.out.println(sum);
	}

}

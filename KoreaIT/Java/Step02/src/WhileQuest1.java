import java.util.Scanner;

public class WhileQuest1 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아서 해당 숫자의 개수만큼 Hello World 출력
		Scanner sc = new Scanner(System.in);
		int n;
		int i = 0;
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		while(i<n) {
			System.out.println("Hello World");
			i++;
		}

	}

}

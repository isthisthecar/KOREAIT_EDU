import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		/*
		 * 숫자 하나 입력을 받아서
		 * step 1 : 입력한 숫자의 모든 약수를 출력
		 * step 2 : 입력한 숫자가 완전수 인지 판단하는 코드를 작성
		 * 완전수 : 약수들 중 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		int total=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
				total +=i;
				}
			}
		System.out.println("");
		if(total-n == n) 
			System.out.println("입력하신 숫자는 완전수입니다.");
		else
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
		
	}
}

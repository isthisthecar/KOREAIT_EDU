import java.util.Scanner;

public class ElseIfQuest {

	public static void main(String[] args) {
		/*
		 * 매표소에서 요금을 받음
		 * 나이를 입력 :
		 * 노인 (70~): 2000원
		 * 성인 (20~69): 2500원
		 * 학생 (8~19): 1500원
		 * 영유아(~7세 ): 무료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int older = 2000;
		int adult = 2500;
		int student = 1500;
		int child = 0;
		if(age<=7) {
			System.out.println("요금은 "+child+"원입니다");
		}else if(age < 20) {
			System.out.println("요금은 "+student+"원입니다");
		}else if(age < 70) {
			System.out.println("요금은 "+adult+"원입니다");
		}else {
			System.out.println("요금은 "+older+"원입니다");
		}
	}

}

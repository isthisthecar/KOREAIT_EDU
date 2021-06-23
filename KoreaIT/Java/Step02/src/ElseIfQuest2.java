import java.util.Scanner;

public class ElseIfQuest2 {

	public static void main(String[] args) {
		/*
		 * 평점을 입력 받으면 해당 평점에 해당하는 등급을 출력
		 * 평점 입력 :
		 * 4.5 A+
		 * 4.0~4.4 A
		 * 3.5~3.9 B+
		 * 3.0~3.4 B
		 * 2.5~2.9 C+
		 * 2.0~2.5 C
		 * 1.5~2.0 D+
		 * 1.0~1.4 D
		 * 0.0~0.9 F
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("평점입력 : ");
		double score = sc.nextDouble();
		if(score == 4.5) {
			System.out.println("점수는 A+입니다.");
		}else if(score >= 4.0) {
			System.out.println("점수는 A입니다.");
		}else if(score >= 3.5) {
			System.out.println("점수는 B+입니다.");
		}else if(score >= 3.0) {
			System.out.println("점수는 B입니다.");
		}else if(score >= 2.5) {
			System.out.println("점수는 C+입니다.");
		}else if(score >= 2.0) {
			System.out.println("점수는 C입니다.");
		}else if(score >= 1.5) {
			System.out.println("점수는 D+입니다.");
		}else if(score >= 1.0) {
			System.out.println("점수는 D입니다.");
		}else{
			System.out.println("점수는 f입니다.");
		}
	}

}

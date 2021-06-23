import java.util.Scanner;

public class SwtichQuest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("평점입력 : ");
		double score = sc.nextDouble();
		switch((int)(score/0.5)){
		case 9:
			System.out.println("점수는 A+입니다.");
			break;
		case 8:
			System.out.println("점수는 A입니다.");
			break;
		case 7: 
			System.out.println("점수는 B+입니다.");
			break;
		case 6:
			System.out.println("점수는 B입니다.");
			break;
		case 5: 
			System.out.println("점수는 C+입니다.");
			break;
		case 4: 
			System.out.println("점수는 C입니다.");
			break;
		case 3: 
			System.out.println("점수는 D+입니다.");
			break;
		case 2: 
			System.out.println("점수는 D입니다.");
			break;
		default:
			System.out.println("점수는 f입니다.");
		}
	}
}
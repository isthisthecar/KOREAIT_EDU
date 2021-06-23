import java.util.Arrays;
import java.util.Scanner;

public class Array2DQuest01 {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		
		//길이 출력
//		System.out.println(arr.length);//5 - 행 개수
//		System.out.println(arr[0].length);//5 - 각 행의 열 개수
//		System.out.println(arr[1].length);//5
//		System.out.println(arr[2].length);//5
//		System.out.println(arr[3].length);//5
		
		//값 저장
		Scanner sc = new Scanner(System.in);
		char ch = 'A'; // 알파벳도 숫자 -> 아스키코드
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = ch;
				ch++; // 알파벳도 숫자로 보기 때문에 +1 가능

			}
		}
		
		for(int i=0;i<arr.length;i++) {
//			for(int j = 0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
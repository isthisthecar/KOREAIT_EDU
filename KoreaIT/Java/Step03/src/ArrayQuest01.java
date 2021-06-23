import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest01 {

	public static void main(String[] args) {
		//정수형 배열 5개짜리 선언
		//선언한 배열에 값을 Scanner 이용해서 직접 입력
		//입력이 끝난 후에 배열의 내용을 전체 출력
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		for(int i = 0; i<arr1.length;i++) {
			System.out.print(i+1+"번째 배열 값 입력 : ");
				arr1[i] = sc.nextInt();
		}
		System.out.println();
//		for(int i = 0; i<arr1.length;i++) { 
//			System.out.print(arr1[i]+ " ");
//		}
		System.out.println(Arrays.toString(arr1));
	}

}

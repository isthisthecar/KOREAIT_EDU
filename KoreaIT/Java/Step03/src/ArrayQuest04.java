import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest04 {

	public static void main(String[] args) {
		/*
		 *  정수형 배열 10개짜리 선언
		 *  숫자 10개를 입력을 받아서 배열에 저장을 할때
		 *  짝수면 맨 앞에서 부터 채움
		 *  홀수면 맨 뒤에서 부터 채움
		 *  
		 *  입력이 끝나면 배열에 모든 요소를 출력
		 */
		Scanner	sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int count = 0, num;
		int i =9;
		int j =0;
		while(i>=j) {
			System.out.print("배열 값 입력 : ");
				num = sc.nextInt();
					if(num%2 ==0) {
						arr1[i] = num;
						i--;
					}
					else {
						arr1[j]=num;
						j++;
					}
		}	
		System.out.println(Arrays.toString(arr1));
				
	}
}
		



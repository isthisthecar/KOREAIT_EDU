import java.util.Scanner;

public class ArrayQuest03 {

	public static void main(String[] args) {
		/*
		 *  정수형 배열 10개짜리 선언
		 *  선언한 배열에 값을 Scanner 이용해서 직접 입력
		 *  배열의 저장된 값들 중에 짝수 개수를 출력
		 */
		Scanner	sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		for(int i = 0 ; i <arr1.length;i++) {
			System.out.print(i+1+"번재 배열 값 입력 : ");
				arr1[i] = sc.nextInt();
		}
		int count=0;
		for(int i = 0; i < arr1.length;i++) { 
			if(arr1[i]%2 == 0)
				count++;		
		}
		System.out.println(count);
	
	}
	

}

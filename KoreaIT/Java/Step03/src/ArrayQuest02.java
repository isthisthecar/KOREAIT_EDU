import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest02 {

	/*
	 *  정수형 배열 5개짜리 선언
	 *  선언한 배열에 값을 Scanner 이용해서 직접 입력
	 *  배열의 저장된 값들 중에 최대값, 최소값을 출력
	 */
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		for(int i = 0 ; i <arr1.length;i++) {
			System.out.print(i+1+"번재 배열 값 입력 : ");
				arr1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
		int max= arr1[0], min;
		min = arr1[0];
		for(int i = 1; i < arr1.length;i++) {
			if(arr1[i]>max)
				max = arr1[i];
		} 
		for(int i = 0; i < arr1.length;i++) {
			if(arr1[i]<min)
				min = arr1[i];
		}
		System.out.println("배열 최대값은 : " + max);
		System.out.println("배열 최소값은 : " + min);
				
		}

}

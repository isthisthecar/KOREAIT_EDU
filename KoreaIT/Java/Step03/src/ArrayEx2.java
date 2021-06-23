
public class ArrayEx2 {

	public static void main(String[] args) {
		// 아래코드에 반복문을 적용
		int[] arr1 = new int[5];
		for(int i = 0, num = 10; i<5;i++, num +=10)
			arr1[i] = num;
		
		for(int i = 0 ; i < 5;i++) 
			System.out.println(arr1[i]);
		
		int[] arr2 = new int[10];
		for(int i = 0 ; i<arr2.length;i++)  // length 배열의 갯수, 길이값을 나타내줌
			arr2[i] =(i+1) * 2 ;
		
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}

}


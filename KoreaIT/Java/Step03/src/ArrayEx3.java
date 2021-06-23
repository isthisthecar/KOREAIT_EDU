
public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열 생성시 기본값을 저장 : 0,  0.0, false, null
		// int형 길이가 5인 배열 생성
		// double형 길이가 5인 배열 생성
		// boolean형 길이가 5인 배열 생성
		// String형 길이가 5인 배열 생성
		
		// 각배열의 값을 전부 출력
		
		int[] A = new int[5];
		double[] B = new double[5];
		boolean[] C = new boolean[5];
		String[] D = new String[5];

		for(int i = 0 ; i<A.length; i++)
			System.out.print(A[i]);
			System.out.println("");
		for(int i = 0 ; i<B.length; i++)
			System.out.print(B[i]);
			System.out.println("");
		for(int i = 0 ; i<C.length; i++)
			System.out.print(C[i]);
			System.out.println("");
		for(int i = 0 ; i<D.length; i++) 
			System.out.print(D[i]);

	}

}

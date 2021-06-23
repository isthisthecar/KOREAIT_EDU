
public class LoopInLoop {

	public static void main(String[] args) {
		/*
		 *  반복문 --> 원하는 만큼 코드를 반복
		 *  
		 */
		int i=2;
		int n=1;
		while(i<10) {
			System.out.println(i+"단");
				while(n<10) {
					System.out.println(i+" * "+n+ " = " + i*n);
					n++;
				}
			n=1;
			i++;
		}
	}
}

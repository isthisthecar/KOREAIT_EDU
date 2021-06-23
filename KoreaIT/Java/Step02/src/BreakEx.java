
public class BreakEx {

	public static void main(String[] args) {
		// 무한 루프
		int i = 1, total = 0;
		while(true) {
			total += i;
			i++;
			if(total > 5000)
				break;//if와 같이 쓰임, 감싸고 있는 반복문 종료.
		}
		System.out.println(total);
	}

}

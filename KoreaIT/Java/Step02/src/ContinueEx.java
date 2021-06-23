
public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 1;i<101;i++) {
			if(i%2==1)
				continue;
		
			System.out.println(i);
		}
		//-------------------------
		//위에 코드 while로 변경
		int i = 1;
		while(i<101) {
			i++;
			if(i%2==1)
				continue;
			
			System.out.println(i);
		}
	}

}

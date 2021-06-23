import java.util.Scanner;

public class LoopInLoopQuest1 {

	public static void main(String[] args) {
		/*                            
		 *               *              
		 *              **                 
		 *             ***                
		 *            ****
		 *           *****
		 *          
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = "";
			// 공백 처리
			for (int j = 0; j < n - i - 1; j++) {
				str += " ";
			}
			//별 처리
			for(int j=0;j<=i;j++)
				str += "*";
			System.out.println(str);
		}

	}

}

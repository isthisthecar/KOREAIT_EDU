import java.util.Arrays;

public class Array2DQuest04 {
		/*
		 *  A B C D E
		 *  P Q R S F  
		 *  O X Y T G
		 *  N W V U H
		 *  M L K J I
		 */         
	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char alpha = 'A';
		int x = 0, y = 0;
		for(;;y++) {
			arr[x][y] = alpha++;
			if(y==4)
				break;
		}x++; // 오른쪽
		for(;;x++) {
			arr[x][y] = alpha++;
			if(x==4)
				break;
		}y--; // 아래
		for(;;y--) {
			arr[x][y] = alpha++;
			if(y==0)
				break;
		}x--; // 왼쪽
		for(;;x--) {
			arr[x][y] = alpha++;
			if(x==1)
				break;
		}y++; // 위
		for(;;y++) {
			arr[x][y] = alpha++;
			if(y==3)
				break;
		}x++; // 오른쪽
		for(;;x++) {
			arr[x][y] = alpha++;
			if(x==3)
				break;
		}y--; // 아래
		for(;;y--) {
			arr[x][y] = alpha++;
			if(y==1)
				break;
		}x--; // 왼쪽
		for(;;x++) {
			arr[x][y] = alpha++;
			if(x==2)
				break;
		}y++; // 위
		for(;;x++) {
			arr[x][y] = alpha++;
			if(x==2)
				break;
		}y++; // 오른쪽
			

		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}

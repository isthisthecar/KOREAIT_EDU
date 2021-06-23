
public class BreakQuest {
		/*
		 *     AZ
		 *  +  ZA
		 *  ------
		 *     99
		 */
	public static void main(String[] args) {
	for(int A=0;A<10;A++) 
		for(int Z=0;Z<10;Z++) 
			if(A + Z == 9) {
				System.out.println("("+A+","+Z+")");
				break;
			}
		}
}


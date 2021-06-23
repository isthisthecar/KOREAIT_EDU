
public class StringEquals {

	public static void main(String[] args) {
		String str1 = "Hello"; //str1 주소안에 "Hello"가 저장됨
		String str2 = str1; //str1의 주소값을 저장되고 주소안에 있는 값을 꺼내옴
		String str3 = new String("Hello"); // new가 붙으면 새로운 주소(메모리)를 생성하여 값을 저장
		String str4 = "Hello";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); // 주소값이 달라 false가 나오게 됨.
		System.out.println(str1 == str4);

		System.out.println("-------------------");
		// 내용 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4)); // 메모리주소값 비교가 아닌 내용으로만 비교하게 함.
	}

}

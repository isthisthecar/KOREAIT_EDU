
public class Person {
	//인적정보를 저장 -> main들어가지 않음
	String name;
	int age;
	char gender;
	
	// 생성자 : 클래스를 생성할때 제일 먼저 실행되는 기능
	// 기능명 : 클래스명
	Person(){
		System.out.println("기본 생성자");
		name = "이름값";
		age = 999;
		gender ='남';
		
	}
	//생성시 이름만 받아옴
	Person(String n){
		name = n;
		System.out.println("Person(String)");
	}
	//생성시 이름, 나이, 성별을 받아옴
	Person(String n, int a, char g){
		name = n;
		age = a;
		gender = g;
		System.out.println("Person(String, int,char)");
	}
	
	// 개인 인적사항 출력
	// 다른 언어에서는 메쏘드를 함수라고 함.
	
	void printinfo(){
		System.out.println(name + " " + age + " " + gender);
	}
	
}

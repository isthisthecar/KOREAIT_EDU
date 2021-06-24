
public class Student {
	//학교
	String studentNo;
	//학년
	String major;
	//이름
	String name;
	//성적
	double score;
	
	// 전체 필드 초기화하는 생성자
	
	Student(String studentNo, String major, String name, double score){
		this.studentNo = studentNo;
		this.major = major;
		this.name = name;
		this.score = score;
	}
	
	public Student(String studentNo, String major, String name) {
		super();
		this.studentNo = studentNo;
		this.major = major;
		this.name = name;
	}



	Student(String studentNo){
		// this 키워드는 자기 자신 객체를 나타내는 키워드
//		this.studentNo = studentNo;
		//다른 생성자 호출
		this(studentNo,"이름","전공",0.0);
		
//	}
	
	// 학생정보 출력하는 메서드
	// 학번, 이름, 학과, 평점(등급)

	}
	String printMajor(String major1) {
		return major1;
	}
	String printName(String name1) {
		return name1;
	}
	double printScore(double score1) {
		return score1;
	}
	
	void printsutdentinfo(){
		System.out.println("학번 = "+studentNo);
		System.out.println("이름 = "+name);
		System.out.println("학과 = "+major);
		System.out.println("평점 = "+score+", "+"등급 = "+getGrade());
	}
	void printsutdentinfo1() {
		System.out.println(studentNo + " " + name + " " + major + " " + score + "" + getGrade());
	}
	//평점 등급을 구하는 메서드
	String getGrade() {
		String grade = "F";
		if(score ==4.5)
			grade = "A+";
		else if(score >= 4.0)
			grade = "A";
		else if(score >= 3.5)
			grade = "B+";
		else if(score >= 3.0)
			grade = "B";
		else if(score >= 2.5)
			grade = "C+";
		else if(score >= 2.0)
			grade = "C";
		else if(score >= 1.5)
			grade = "D+";
		else if(score >= 1.0)
			grade = "D";
		
		return grade;
	}
	
}

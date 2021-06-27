package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[]	arr;
	private int index;
	
	private static StudentService instance = new StudentService();

	public StudentService() {
		arr = new StudentVO[10];
		index = 0; // 데이터가 등록될 배열 인덱스 번호
	}
	public static StudentService getInstance() {
		if(instance ==null)
			instance = new StudentService();
		return instance;
	}
	
	// 배열 길이 늘리기
	public void reallocArray() {
		StudentVO[] temp = arr;
		arr = new StudentVO[temp.length +5];
		for(int i = 0; i<temp.length;i++)
			arr[i] = temp[i];
	}
	
	// 학생 데이터 등록
	//    학생 데이터 입력 받아서 배열에 등록
	// 1. 데이터 입력받을 변수명 student 생성자의 매개변수명과 동일하게 사용
	// 2. 
	public void insertStudent(Scanner sc) {
		//학생데이터 입력
		System.out.println("-----학생정보를 등록합니다 -----");
		if(index == arr.length) {
//			System.out.println("더 이상 저장할 공간이 없습니다.");
//			return;
		}
		//학번
		System.out.println("학번을 입력하세요 : ");
		String studentNo = sc.nextLine();
		//학년
		System.out.println("이름을 입력하세요 : ");
		String name =sc.nextLine();
		//이름
		System.out.println("학과을 입력하세요 : ");
		String major = sc.nextLine();;
		//성적
		System.out.println("점수를 입력하세요 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		//Student 객체 생성
		//배열에 저장 
		//자동완성으로 vo에서 만들걸 가져옴
		arr[index] = new StudentVO(studentNo, major, name, score);
	    //index 증가
		index++;
	}

	// 학생 데이터 검색 - 학번을 기준으로 검색
	public void selectStudent(Scanner sc) {
		System.out.println("-----학생 정보 검색을 시작합니다-----");
		System.out.println("검색할 학번을 입력하세요 : ");
		String no = sc.nextLine();
		StudentVO vo = null;
		
		for(int i = 0; i <index; i++) {
			if(arr[i].getStudentNo().equals(no)) {
				vo = arr[i]; // 동일한 값이 있으면 vo에 저장
				break;
			}
		}
	
	if(vo==null){
		System.out.println("검색결과가 없습니다.");
	}else {
		vo.printStudentInfo();
	}
	}
	// 학생 데이터 삭제
	public void deleteStudent(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다..............");
		System.out.print("삭제할 학번 입력 : ");
		String no = sc.nextLine();
		
		for(int i=0;i<index;i++) {
			//학번이 동일한지 체크
			if(arr[i].getStudentNo().equals(no)) {
				for(int j=i;j<index-1;j++) {
					arr[j] = arr[j+1];
				}
				index--;
				System.out.println("데이터 삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}
	// 학생 데이터 수정
	public void updateStudent(Scanner sc) {
		System.out.println("----학생 정보 수정을 시작합니다.-----");
		//검색
		System.out.print("수정할 학번 입력 : ");
		String no = sc.nextLine();
		StudentVO vo= null;
		int r = -1;
		for(int i = 0;i<index;i++) {
			//학번이 동일한지 체크
			if(arr[i].getStudentNo().equals(no)) {
				vo = arr[i]; // 동일한 값이 있으면 vo에 저장
				r=i;
				break;
			}
		}
		// 검색결과 없는 경우
		// 메서드 종료
		if(vo == null) {
			System.out.println("수정할 대상이 없습니다.");
			return;
		}
		// 검색결과가 있는 경우
		// 학번을 제외한 모든 데이터를 입력
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("학과 입력 : ");
		String major = sc.nextLine();
		System.out.print("평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		// 입력 받은 데이터를 다시 검색 결과에 저장 수정
//		vo.setMajor(major);
//		vo.setName(name);
//		vo.setScore(score);
		//새로 생성해서 객체를 교체 - 방법2
		arr[r] = new StudentVO(no, name, major, score);
		
	}
	// 학생 데이터 데이터 출력
	public void selectAllStudent() {
		System.out.println("학생 전체 데이터를 출력합니다...");
		if(index == 0 ) {
			System.out.println("등록된 학생 데이터가 없습니다.");
			return;
		}
		for(int i=0;i<index;i++) {
			arr[i].printStudentInfo();
		}
	}
	
}

package main;

import java.util.*;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = StudentService.getInstance();
		
		while(true) {
			System.out.println("----학적관리 프로그램----");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 전체 학생정보 출력");
			System.out.println("0. 프로그램종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요");
			int no = sc.nextInt();
			sc.nextLine();  //숫자 입력을 받으면 이걸 써줘야함. nextInt는 숫자만 가져가고 엔터(줄바꿈)은 남게되서 다음 문자열을 받을때 받을수가 없음.
			if(no == 0 ) break;
			
			switch(no) {
			case 1:
				service.insertStudent(sc);
				break;
			case 2:
				service.selectStudent(sc);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				service.selectAllStudent();
				break;
			}
			
		}
		

	}

}

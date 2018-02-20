package com.iu.s1;

import java.util.Scanner;

public class SchoolController {

	//메서드명 start
	//리턴은 x
	//내용
	//1. 학생 등록
	//2. 성적 입력
	//3. 성적 조회
	//4. 전체 조회
	//5. 프로그램 종료

	public void start() {
		int num = 0;
		boolean check = true;
		while(check) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 성적 입력");
			System.out.println("3. 성적 조회");
			System.out.println("4. 전체 조회");
			System.out.println("5. 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하세요.");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("1. 학생 등록");
				break;
			case 2:
				System.out.println("2. 성적 입력");
				break;
			case 3:
				System.out.println("3. 성적 조회");
				break;
			case 4:
				System.out.println("4. 전체 조회");
				break;
			case 5:
				System.out.println("5. 프로그램 종료");
				check = !check;
				break;
			default:
				System.out.println("잘못 입력된 번호입니다.");
			}
		}
	}


}

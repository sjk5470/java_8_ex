package com.iu.s1;

import java.util.Scanner;

public class StudentService {
	
	//학생 추가 메서드
	//메서드명 addStudent
	//학생의 인원수를 입력하세요
	//학생수만큼 반복해서
	//이름입력
	//번호입력
	
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 인원 수를 정하세요.");
		int numbers = sc.nextInt();
		Student[] student = new Student[numbers];
		for(int i =0; i < student.length; i++) {
			Student student2 = new Student();
			System.out.println("학생의 이름을 입력하세요.");
			student2.name = sc.next();
			System.out.println("학생의 번호를 입력하세요.");
			student2.num = sc.nextInt();
			student[i] = student2;
		}
		return student;
	}
	
}

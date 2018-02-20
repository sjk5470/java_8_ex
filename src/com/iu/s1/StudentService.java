package com.iu.s1;

import java.util.Scanner;

public class StudentService {
	
	//학생 추가 메서드
	//메서드명 addStudent
	//학생의 인원수를 입력하세요
	//학생수만큼 반복해서
	//이름입력
	//번호입력
	
	Scanner sc = new Scanner(System.in);
	public Student[] addStudent() {
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
	
	//메서드명은 addPoint
	//내용 : 각 학생의 점수 입력
	
	public void addPoint(Student[] stu) {
		for(int i=0; i< stu.length; i++) {
			System.out.println(stu[i].name + "학생의 국어점수를 입력하세요.");
			stu[i].kor = sc.nextInt();
			System.out.println(stu[i].name + "학생의 영어점수를 입력하세요.");
			stu[i].eng = sc.nextInt();
			System.out.println(stu[i].name + "학생의 수학점수를 입력하세요.");
			stu[i].math = sc.nextInt();
			stu[i].total = stu[i].kor +stu[i].eng+stu[i].math;
			stu[i].avg = stu[i].total/3;
		}
	}
	
}

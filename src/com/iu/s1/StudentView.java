package com.iu.s1;

public class StudentView {
	
	//학생들의 정보를 출력
	//메서드명 view
	//학생들의 정보를 출력
	
	public void view(Student[] stu) {
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생의 이름 :"+stu[i].name);
			System.out.println("학생의 번호 :"+stu[i].num);
			System.out.println("국어점수 :"+stu[i].kor);
			System.out.println("영어점수 :"+stu[i].eng);
			System.out.println("수학점수 :"+stu[i].math);
			System.out.println("총 점 :"+stu[i].total);
			System.out.println("평 균 :"+stu[i].avg);
		}
	}
	
}

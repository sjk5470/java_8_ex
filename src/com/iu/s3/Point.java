package com.iu.s3;

public class Point {
	
	//메서드 오버로딩(overloading)
	//메서드 오버로딩 조건
	//메서드의 이름은 같아야함
	//단, 매개변수의 타입, 또는 갯수가 달라야함.
	//접근지정자, 리턴타입은 상관 없음

	public void hap(int a, int b) {
		System.out.println(a+b);
	}
	
	public void hap(int a, float b) {
		System.out.println(a+b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a+b);		
	}
	
}

package com.iu.s2;

public class Shef_Steak {
	
	public Food_Steak makeSteak(int select) {
		Food_Steak steak = new Food_Steak();
		Shef_Source source = new Shef_Source();
		switch(select) {
		//1. 안심스테이크, 30000, 1번소스
		case 1:
			steak.name = "안심스테이크";
			steak.price = 30000;
			steak.source = source.makeSource(1);
			break;
		//2. 등심스테이크, 40000, 2번소스
		case 2:
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = source.makeSource(2);
			break;
		//3. 립스테이크, 50000, 1번 소스
		case 3:
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = source.makeSource(1);
			break;		
		}
		
		return steak;
	}
	
}

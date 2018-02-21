package com.iu.s2;

public class Food_Main {
	
	public static void main(String [] args) {
		/*
		Shef_Source s = new Shef_Source();
		Food_Source source = s.makeSource(2);
		if(source != null) {
			System.out.println(source.oilName);
			System.out.println(source.spiceName);
		}
		
		Shef_Steak st = new Shef_Steak();
		Food_Steak ft = st.makeSteak(3);
		if(ft != null) {
			System.out.println(ft.name);
			System.out.println(ft.price);
			System.out.println(ft.source.oilName);
			System.out.println(ft.source.spiceName);
		}
		
		Shef_Pasta sp = new Shef_Pasta();
		Food_Pasta fp = sp.makePasta(1);
		if(fp != null) {
			System.out.println(fp.name);
			System.out.println(fp.price);
			System.out.println(fp.source.oilName);
			System.out.println(fp.source.spiceName);
		}
		
		*/
		new Menu().order();
		
	}
	
}

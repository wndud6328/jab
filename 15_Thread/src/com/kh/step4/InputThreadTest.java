package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {
	
	boolean check = false;

	
	public static void main(String[] args) {

		InputThreadTest itt = new InputThreadTest();
		
//		InputTest it = new InputTest(itt);
//		ThreadTest it2 = new ThreadTest(itt);
//		ThreadBeep it3 = new ThreadBeep();
		
		Thread b = new Thread(new InputTest(itt));
		Thread b2 = new Thread(new ThreadTest(itt));
//		Thread b3 = new Thread(it3, "ThreadBeep");
		
		b.start();
		b2.start();
//		b3.start();
	}

}

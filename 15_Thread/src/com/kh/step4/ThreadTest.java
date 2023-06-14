package com.kh.step4;

import javax.swing.JOptionPane;

public class ThreadTest implements Runnable{

	InputThreadTest a;
	
	public ThreadTest(InputThreadTest itt) {
		this.a = itt;
	}


	@Override
	public void run() {
		
		for(int i =10; i>0; i--) {
			try {
				Thread.sleep(1000);
				if(a.check) {
					break;
				}
			} catch (InterruptedException e) {}
			System.out.println(i);
		}
		
		if(!a.check) {
			System.out.println("입력시간 초과입니다.");
			System.exit(0);
		}
		
	}
	}



package com.kh.step4;

import java.awt.Toolkit;

public class ThreadBeep implements Runnable{

	InputThreadTest itt;
	
	public ThreadBeep(InputThreadTest itt) {
		this.itt = itt;
	}

	@Override
	public void run() {
		Toolkit tool =Toolkit.getDefaultToolkit();

		for(int i=0; i<10; i++) {
			tool.beep();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}

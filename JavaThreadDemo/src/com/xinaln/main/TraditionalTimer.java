package com.xinaln.main;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ��
 * 
 * @author Administrator
 *
 */
public class TraditionalTimer {
	public static void main(String[] args) {
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("��ը!Bomb!");
			}
		}, 0,1000);//ÿ��һ��ִ��һ��
		//ָ��ʱ��֮��ִ��
	}
}//end class

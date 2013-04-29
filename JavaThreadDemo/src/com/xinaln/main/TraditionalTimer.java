package com.xinaln.main;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
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
				System.out.println("爆炸!Bomb!");
			}
		}, 0,1000);//每隔一秒执行一次
		//指定时间之后执行
	}
}//end class

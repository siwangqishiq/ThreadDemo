package com.xinaln.main;

/**
 * 线程互斥
 * 
 * 多个线程操作共享的数据时 会发生
 * @author Administrator
 *
 */
public class ThreadMutex {

	public static void main(String[] args) {
		
	}
    class lan{
    	public synchronized void doSomeThing(){
    		System.out.println("out do something");
    	}
    }// end inner class
}//end class

package com.xinaln.main;

/**
 * �̻߳���
 * 
 * ����̲߳������������ʱ �ᷢ��
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

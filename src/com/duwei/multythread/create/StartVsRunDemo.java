package com.duwei.multythread.create;
/**
 * ����Thread.start&&Thread.run�����𣡣���
 * @author ��ΰ
 */
public class StartVsRunDemo {

	public static void main(String[] args) {
//		Thread thread = new Thread("t1"){
//			@Override
//			public void run(){
//				System.out.println(Thread.currentThread().getName());
//			}
//		};
//		thread.start();
//----------------------------------------
		Thread thread = new Thread("t1"){
			@Override
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		thread.run();
	}

}
package com.practice;

class Counter {
	int count;

	public synchronized void increase() {
		this.count++;
	}
}

public class myMultiThreading {

	public static void main(String[] args) throws Exception {
		Counter c1 = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					c1.increase();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					c1.increase();
				}
			}
		});
		
		Counter c2 = new Counter();

		Thread t21 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					c2.increase();
				}
			}
		});
		Thread t22 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					c2.increase();
				}
			}
		});
		
		t1.start();
		t21.start();
		t2.start();
		t22.start();
		t1.join();
		t2.join();
		System.out.println( "C1 Counter:   "+ c1.count);
		System.out.println("C2 Counter:    "+c2.count);
	}

}

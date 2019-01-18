package com.threaddemo;

import java.util.List;

public class Notifier implements Runnable {
	List<String> message;

	Notifier(List<String> message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Notifier run "+Thread.currentThread().getName());
		synchronized (message) {
			System.out.println("Notifier synchronized "+Thread.currentThread().getName());
			//message.notify();
			message.notifyAll();
		}
	}

}

package com.threaddemo;

import java.util.List;

public class Waiter implements Runnable{

	List<String> message;

	Waiter(List<String> message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Waiter run "+Thread.currentThread().getName());
		synchronized(message) {
			System.out.println("Waiter synchronized "+Thread.currentThread().getName());
			try {
				message.wait();
				System.out.println("waiter got notified "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("InterruptedException "+e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
}

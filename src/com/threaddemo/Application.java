package com.threaddemo;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		System.out.println("application main");
		
		Message message = new Message();
		List<String> name = new ArrayList<>();
		name.add("mars");
		name.add("mercury");
		name.add("venus");
		name.add("jupiter");
		name.add("pluto");
		name.add("uranus");
		message.setName(name);
		
		Waiter w1 = new Waiter(name);
		Waiter w2 = new Waiter(name);
		Waiter w3 = new Waiter(name);
		
		Notifier n1 = new Notifier(name);
		
		Thread tw1 = new Thread(w1);
		Thread tw2 = new Thread(w2);
		Thread tw3 = new Thread(w3);
		
		Thread tn1 = new Thread(n1);
		
		tw1.start();
		tw2.start();
		tw3.start();
		tn1.start();
		
		System.out.println("end main");

	}

}

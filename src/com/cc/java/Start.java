package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
	HoneyBee queen = new Queen();
	HoneyBee worker = new Worker();
	HoneyBee drone = new Drone();
	
	Bird bird = new Bird();
	
	ausgabe(queen.fly());
	ausgabe(worker.fly());
	ausgabe(drone.fly());
	ausgabe(bird.fly());
	
	ausgabe("--------------------");

	ausgabe(queen.doYourJob());
	ausgabe(worker.doYourJob());
	ausgabe(drone.doYourJob());
	
	ausgabe(bird.hasFeathers());
	
	
	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}

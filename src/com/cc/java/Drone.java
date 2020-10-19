package com.cc.java;

public class Drone extends HoneyBee{

	public String doYourJob() {
		return "I am a drone, I'm going to date our queen!";
	}
	
	@Override
	public String fly() {
		return "I'm a bee, I can fly!";
	}
}

package com.genyherrera.crackingthecodeinterview.interviewquestions;

public class Box implements Comparable<Box> {
	private int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Box(int number) {
		this.number = number;
	}
	@Override
	public int compareTo(Box o) {
		return Integer.compare(this.number, o.getNumber());
	}
}

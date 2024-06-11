package com.company.ThreadPractice;

public class SleepMethod extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {Thread.sleep(500);}catch(InterruptedException e) {e.printStackTrace();}//500 milliSecond
			System.out.println(getName()+": "+i);
			try {Thread.sleep(500);}catch(InterruptedException e) {e.printStackTrace();}//500 milliSecond
			System.out.println(getName()+": "+(i+1));
		}
	}
	public static void main(String[] args) {
		SleepMethod s1=new SleepMethod();
		s1.setName("first");
		SleepMethod s2=new SleepMethod();
		s2.setName("Second");
		s1.start();
	
		s2.start();
		
	}

}

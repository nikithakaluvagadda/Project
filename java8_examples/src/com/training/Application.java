package com.training;

public class Application {
	public static void main(String[] args) {
		Runnable exp=()->{
			for(int i=0;i<=5;i++) {
				System.out.println("hi lambda");
			}
		};
	
Thread t=new Thread(exp);
t.start();
}
}
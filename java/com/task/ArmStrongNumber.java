package com.task;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int num=153, temp=num,arm=0,n=0;
		
		while (num>0) {
			
			n=num%10;
			arm=(n*n*n)+arm;
			num=num/10;	
			
		}
		
		System.out.println(arm);
		if (arm==temp) {
			
			System.out.println("this is armstrong number");
			
		} else {
			
			System.out.println("this is not armstrong number");

		}
		
	}

}

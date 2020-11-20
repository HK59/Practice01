package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구의 부피를 구하는 공식//
		float m;
		m= 3.14F;
		float v,r;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("반지름: ");
		r= sc.nextFloat();
		
		
		System.out.println("구의 부피는" + r*r*m+ "입니다.");
	}

}

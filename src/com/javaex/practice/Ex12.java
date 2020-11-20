package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		int num;
		float fnum = 3.14F;
		num=sc.nextInt();
		
		System.out.println("원의 넓이는" + num*num*fnum + "입니다.");
		sc.close();
	}

}

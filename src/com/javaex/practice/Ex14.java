package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("가로의 길이를 입력하시오:");
		System.out.print("세로의 길이를 입력하시오:");
		
		System.out.println("사각형의 넓이는"+ a*b + "입니다.");
		System.out.println("사각형의 둘레는" + (a+b)*2 + "입니다.");
	
		sc.close();
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin01,coin02,coin03,coin04;
		int sum; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		coin01= sc.nextInt()*500;
		System.out.print("100원 개수: ");
		coin02= sc.nextInt()*100;
		System.out.print("50원 개수: ");
		coin03= sc.nextInt()*50;
		System.out.print("10원 개수: ");
		coin04= sc.nextInt()*10;
		
		sum = coin01 + coin02 + coin03 + coin04;
		
		System.out.println("동전의 합은 " + sum + "원 입니다.");
		
		sc.close();
		
		
	}

}

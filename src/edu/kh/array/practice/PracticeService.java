package edu.kh.array.practice;

import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 1; i < input; i++) {
			arr[i] = i;
			System.out.println(i);
		}
		
	}

}

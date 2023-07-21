package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	// 때려보다 맞춤.. 모르는 문제
	public void practice2() {
		int[] arr= new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	// 못푼 문제
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			System.out.printf("입력 %d : %d\n", i, num);
			arr[i] = num;
		}
		
		
		
	}
	
	// 어떻게 답이 나왔지 ..?
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\ni 개수 : " + count);
		
	}
	
	// 못푼 문제
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < num; j++) {
				System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", j);
				int input = sc.nextInt();

			}
			
		}
		
	}
	
	// 못푼 문제
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		
		char[] arr = new char[idNum.length()];
		
		for(int i = 0; i < idNum.length(); i++) {
			arr[i] = idNum.charAt(i);
		
		}
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		int random = (int)(Math.random() * 10 + 1);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random;
		}
		
		System.out.println("발생한 난수 : ");
	}
}

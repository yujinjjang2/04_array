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
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
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
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == search) {
				System.out.println("인덱스 : " + i);
				
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		String[] arr = new String[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(str.charAt(i));
		}
		
		System.out.print("문자 : ");
		String search = sc.nextLine();
		
		int count = 0;
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, search);
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(search)) {
				System.out.print(i + " ");
				
				count++;
			}
		}
		
		System.out.printf("\n%s 개수 : %d", search, count);
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.print("\n총합 : " + sum);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		String[] arr = new String[id.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = String.valueOf(id.charAt(i));
//			if(i >= 8) {
//				arr[i] = "*";
//			} else {
//				arr[i] = String.valueOf(id.charAt(i));
//			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i >= 8) {
				
				arr[i] = "*";
			}
		}
		
		System.out.println(String.join("", arr));
	}
	
	// 다시 생각
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		// 입력한 값을 변수(input)에 담았음...(5)
		for(int i = 0; i < 1000; i++) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			if(input % 2 == 0 || input < 3) {
				System.out.println("다시 입력하세요");
				continue;
			}
			break;
		}

		// 입력받은 값을 배열을 선언하고 배열안에다가 값을 넣었어...(12345)		
		int[] arr = new int[input];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 입력한 값의 반을 구함...(3)
		int half = input / 2 + 1;
		
		// 값을 찍는다...
		int  nCnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i < half) {
				nCnt ++;
				System.out.print(nCnt + " ");
			}
			else {
				nCnt --;
				System.out.print(nCnt + " ");
			}
		}
		
	}
	
	public void practice9() { 
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			//i=3 , random = 2
			arr[i] = random;
			
			for(int j = 0; j < i; j++) {
				
				if(random == arr[j]) {
					i--;
					break;
				}
			}
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		String[] arr = new String[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(str.charAt(i));
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("배열의 크기를 입력하세요 : ");  //3
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		for(int i = 0; i < arr.length; i++) {
			count++;
			System.out.print(count + "번째 문자열 : ");
			String input = sc.next();
			
			arr[i] = input;
		}
		
		System.out.print("더 값을 입력하시겠습니끼?(Y/N) : ");
		String input2 = sc.next();
		
		if(input2.equals("y")) {
			System.out.print("더 입력하고 싶은 개수 : ");
			int input3 = sc.nextInt();
			
			String[] arr1 = new String[input3];
			for(int i = 0; i < arr1.length; i++) {
				count++;
				System.out.print(count + "번째 문자열 : ");
				String input4 = sc.next();
				arr1[i] = input4;
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String input5 = sc.next();
			
			if(input5.equals("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int input6 = sc.nextInt();
				
				String[] arr2 = new String[input6];
				
				for(int i = 0; i < arr2.length; i++) {
					count++;  //6
					System.out.print(count + "번째 문자열 : ");
					String input7 = sc.next();
					arr2[i] = input7;
				}
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				String input8 = sc.next();
				
				if(input8.equals("n")) {
					String aa = String.join(",", arr)
							   +","
							   +String.join(",", arr1)
							   +","
							   +String.join(",", arr2);
					System.out.println(aa);
					/*System.out.println(Arrays.toString(arr)
							+ Arrays.toString(arr1) + Arrays.toString(arr2));
							*/
				}
				
			} else {
				String aa = String.join(",", arr)
						   +","
						   +String.join(",", arr1);
				System.out.println(aa);
			}
			
		} else {
			String aa = String.join(",", arr);
			System.out.println(aa);
		}
		
	}
}

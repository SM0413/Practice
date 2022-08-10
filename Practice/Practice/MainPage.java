package Practice;


import java.util.*;



public class MainPage {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {


		System.out.println("Git연동 완료");
		System.out.println("Welcome to MainPage");
		while(true) {
			ChoicePrograme();
			try {
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1 :
					RandomPassword();
					continue;
				case 2 :
					LottoNumber();
					continue;
				case 3 :
					GuGudan();
					continue;
				case 0 : 
					System.out.println("프로그램 종료");
					return;
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("정확한 값을 입력해 주세요");
				continue;
			}
		}

	}

	private static void GuGudan() {
		Basic basic = new Basic();	
		while(true) {
			try {
				System.out.println("구하려는 구구단의 단수를 입력하세요");
				System.out.println("2 ~ 9 각 단");
				System.out.println("0 1~9단 전");
				System.out.print(">");
				int num = sc.nextInt();
				if(num == 1) {
					System.out.println("구구단은 2단부터 출력 가능합니다");
					continue;
				}else if(num > 9) {
					System.out.println("9단 까지만 출력 가능합니다");
					continue;
				}else if(num == 0) {
					//구구단 전체 출력
					basic.AllGuGuDan();
					return;
				}else{	
					//원하는 구구단 출력
					basic.WhatGuGuDan(num);
					return;
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("정확한 값을 입력해 주세요");
				continue;
			}
		}
		
	}

	private static void LottoNumber() {
		Random rd = new Random();
		while(true) {
			System.out.println("출력 횟수를 입력하세요");
			System.out.print(">");
			try {
				int count = sc.nextInt();
				rd.LottoNumber(count);
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("정확한 값을 입력해 주세요");
				continue;
			}
			break;
		}
		
	}

	private static void RandomPassword() {
		Random rd = new Random();
		System.out.println(rd.Password());
		System.out.println();
	}

	private static void ChoicePrograme() {
		System.out.println("프로그램을 선택하세요");
		System.out.println("1. 패스워드 생성 2. 로또번호 생성 3. 구구단");
		System.out.println("0. 종료");
		System.out.print(">");
		
	}

}

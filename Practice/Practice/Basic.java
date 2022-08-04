package Practice;

import java.util.*;

public class Basic {
Scanner sc = new Scanner(System.in);

	public void AllGuGuDan() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	public void WhatGuGuDan(int num) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, 2*i);
		}
		System.out.println();
		return;
	}
	
}

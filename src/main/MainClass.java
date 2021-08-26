package main;

import java.util.Scanner;

import eb.Eun_test;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
	Eun_test eb = new Eun_test();
		while(true) {
			System.out.println("1.한영수 2.진수 3.은별  4.김기범 5.유현준");
			num = scan.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				eb.displ();
				break;
			case 4:
				break;
			case 5:
				break;
				
			}
		}
	}

}

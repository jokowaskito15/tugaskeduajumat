package com.juara.main;

import java.util.Scanner;

class BebasException extends Exception {
		public BebasException(String s) {
		super(s);
	}
		}
		public class UjianBebasException {
		public static void main(String[] args) {

		try {
			throw new BebasException("Throw Custom Message Error");
				} catch (BebasException bebas) {
		// TODO: handle exception
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
		}
		Scanner scan = new Scanner (System.in);
		System.out.println("Masukan jenis kelamin, ketik L/P : ");
		String jk = scan.nextLine();
		System.out.println("Masukan status kawin, ketik menikah/single : ");
		String st = scan.nextLine();
		
		if(jk == "L" && st == "single") {
			throw new ArithmeticException("Kena pajak 10%");
		}
		else if(jk == "L" && st == "menikah") {
			throw new ArithmeticException("Kena pajak 5%");
		}
		else if(jk == "P" && st == "single") {
			throw new ArithmeticException("Kena pajak 7%");
		}
		else {
			throw new ArithmeticException("Kena pajak 3%");
		}
	}
}

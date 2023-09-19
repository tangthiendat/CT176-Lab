package buoi1.basic;

import java.util.Scanner;

public class SoNguyenTo {
	public boolean isPrime(int n) {
		if(n == 1)
			return false;
		if(n == 2)
			return true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		SoNguyenTo p = new SoNguyenTo();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(p.isPrime(n)) {
			System.out.println(n + " là số nguyên tố.");
			System.out.print(Integer.toBinaryString(n));
		}
		else
			System.out.print(n + " không phải là số nguyên tố.");
	}
}

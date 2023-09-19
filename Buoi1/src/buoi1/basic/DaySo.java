package buoi1.basic;

import java.util.Scanner;
public class DaySo {
	int daySo[];
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		int n = sc.nextInt();
		daySo = new int[n];
		for(int i = 0; i < n; i++) 
			daySo[i] = sc.nextInt();
	}
	
	public void in() {
		for(int e : daySo)
			System.out.print(e + " ");
	}
	
	public int dem(int x) {
		int countX = 0;
		for(int e : daySo)
			if(e == x)
				countX++;
		return countX;
	}
	
	public void sapxep() {
		for(int i = 0; i < daySo.length-1; i++)
			for(int j = 1; j < daySo.length; j++) {
				if(daySo[i] > daySo[j]) {
					int temp = daySo[i];
					daySo[i] = daySo[j];
					daySo[j] = temp;
				}	
			}
	}
	public static void main(String args[]) {
		DaySo d = new DaySo();
		d.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập phần tử x cần tìm: ");
		int x = sc.nextInt();
		System.out.println("Có " + d.dem(x)+ " phần tử " + x + " trong dãy số");
		d.sapxep();
		System.out.print("Dãy số sau khi sắp xếp là: ");
		d.in();
	}
}

package de02;

import java.util.Scanner;

public class DCo {
	private String ten, ngay;
	private int dtich;
	
	public DCo() {
		ten = new String();
		dtich = 0;
		ngay = new String();
	}
	
	public DCo(DCo d) {
		ten = new String(d.ten);
		dtich = d.dtich;
		ngay = new String(d.ngay);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten dong co: ");
		ten = sc.nextLine();
		System.out.print("Nhap dung tich: ");
		dtich = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ngay san xuat [dd-mm-yyyy]: ");
		ngay = sc.nextLine();
	}
	
	public void in() {
		System.out.print("Ten dong co: " + ten + ", " + "Dung tich: " + dtich + ", " + "Ngay SX: " + ngay);
	}
	
	public String toString() {
		return "Ten dong co: " + ten + ", " + "Dung tich: " + dtich + ", " + "Ngay SX: " + ngay;
	}
	
	public String getNgay() {
		return ngay;
	}
	
	public String getTen() {
		return ten;
	}
	
	public static void main(String[] args) {
		DCo dc1 = new DCo();
		dc1.nhap();
		dc1.in();
		DCo dc2 = new DCo(dc1);
		System.out.println("\n" + dc2);
	}

}

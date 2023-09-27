package de02;

import java.util.Scanner;

public class DVi {
	private String mdv, tendv;
	private int giuong;
	private boolean dchien;
	
	public DVi() {
		mdv = new String();
		tendv = new String();
		giuong = 0;
		dchien = false;
	}
	
	public DVi(DVi d) {
		mdv = new String(d.mdv);
		tendv = new String(d.tendv);
		giuong = d.giuong;
		dchien = d.dchien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma don vi: ");
		mdv = sc.nextLine();
		System.out.print("Nhap ten don vi: ");
		tendv = sc.nextLine();
		System.out.print("Nhap so giuong: ");
		giuong = sc.nextInt();
		sc.nextLine();
		System.out.print("Da chien [true, false]: ");
		dchien = sc.nextBoolean();
	}
	
	public void xuat() {
		System.out.print("Ma don vi: " + mdv + ", " + "Ten don vi: " + tendv + ", " + "So giuong: " + giuong + ", " + "Da chien: " + dchien);
	}
	
	public String toString() {
		return "Ma don vi: " + mdv + ", " + "Ten don vi: " + tendv + ", " + "So giuong: " + giuong + ", " + "Da chien: " + dchien;
	}
	
	public String getMDV() {
		return mdv;
	}
	public String getTendv() {
		return tendv;
	}
	
	public static void main(String[] args) {
		DVi dv1 = new DVi();
		dv1.nhap();
		dv1.xuat();
		System.out.println("");
		DVi dv2 = new DVi(dv1);
		System.out.println(dv2);

	}

}

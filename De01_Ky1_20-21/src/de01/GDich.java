package de01;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	public GDich(GDich g) {
		mgd = g.mgd;
		hten = new String(g.hten);
		ngay = new String(g.ngay);
		tthai = g.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap ngay giao dich [dd-mm-yyyy]: ");
		ngay = sc.nextLine();
		System.out.print("Nhap trang thai [true(Thanh cong), false(That bai)]: ");
		tthai = sc.nextBoolean();
	}
	
	public void in() {
		System.out.print("Ma GD: " + mgd + ", " + "Ho ten: " + hten + ", " + "Ngay GD: " + ngay +  ", " + "Trang thai: ");
		if(tthai)
			System.out.print("Thanh cong");
		else
			System.out.print("That bai");
	}
	
	public String toString() {
		String s = new String();
		s += "Ma GD: " + mgd + ", " + "Ho ten: " + hten + ", " + "Ngay GD: " + ngay + ", " + "Trang thai: ";
		if(tthai)
			s += "Thanh cong";
		else
			s += "That bai";
		return s;
	}
	
	public float ttien() {
		return 0.0f;
	}
	
	public int getMGD() {
		return mgd;
	}
	
	public String getMonthAndYear(){
		int month = Integer.parseInt(ngay.split("-")[1]);
		int year = Integer.parseInt(ngay.split("-")[2]);
		return month + "-" + year;
	}
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		gd1.nhap();
		gd1.in();
		System.out.println("");
		GDich gd2 = new GDich(gd1);
		System.out.println(gd2);
	}

}

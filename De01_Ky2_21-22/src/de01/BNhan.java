package de01;

import java.util.Scanner;

public class BNhan {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang;
	
	public BNhan() {
		hten = new String();
		gtinh = true;
		nsinh = 0;
		cnang = 0.0f;
	}
	
	public BNhan(BNhan b) {
		hten = new String(b.hten);
		gtinh = b.gtinh;
		nsinh = b.nsinh;
		cnang = b.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap gioi tinh [true(nam), false(nu)]: ");
		gtinh = sc.nextBoolean();
		System.out.print("Nhap nam sinh: ");
		nsinh = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void in() {
		System.out.print("Ho ten: " + hten + ", " + "Gioi tinh: ");
		if(gtinh)
			System.out.print("Nam");
		else
			System.out.print("Nu");
		System.out.print(", " + "Nam sinh: " + nsinh + ", " + "Can nang: " + cnang );
	}
	
	public String toString() {
		String s = new String();
		s += "Ho ten: " + hten + ", " + "Gioi tinh: ";
		if(gtinh)
			s += "Nam";
		else
			s += "Nu";
		s += ", " + "Nam sinh: " + nsinh + ", " + "Can nang: " + cnang ;
		return s;
	}
	
	public String getHten() {
		return hten;
	}
	
	public char getLoai() {
		return 'x';
	}
	
	public String getOdich() {
		return "0";
	}
	
	public boolean hetCachLy() {
		return false;
	}
	
	public static void main(String[] args) {
		BNhan bn1 = new BNhan();
		bn1.nhap();
		bn1.in();
		System.out.println("");
		BNhan bn2 = new BNhan(bn1);
		System.out.println(bn2);

	}

}

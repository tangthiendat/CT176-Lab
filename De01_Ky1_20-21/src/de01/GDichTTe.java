package de01;

import java.util.HashMap;
import java.util.Scanner;

public class GDichTTe extends GDich {
	private float dgia,tgia;
	private int sluong;
	private char loai;
	
	public GDichTTe() {
		super();
		dgia = 0.0f;
		sluong = 0;
		loai = 'V';
		tgia = 0.0f;
	}
	
	public GDichTTe(GDichTTe g) {
		super(g);
		dgia = g.dgia;
		sluong = g.sluong;
		loai = g.loai;
		tgia = g.tgia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.print("Nhap so luong: ");
		sluong = sc.nextInt();
		sc.nextLine();
		do {
			System.out.print("Nhap loai tien te [V(Viet Nam), U(USD), E(Euro)]: ");
			loai = sc.nextLine().charAt(0);
			if(loai != 'V' && loai != 'U' && loai != 'E')
				System.out.println("Loai tien te khong hop le. Hay nhap lai!");
		}while(loai != 'V' && loai != 'U' && loai != 'E');
		
		System.out.print("Nhap ti gia: ");
		tgia = sc.nextFloat();
		sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.print(", " + "Don gia: " + dgia + ", " + "So luong: " + sluong + ", " + "Loai tien te: ");
		if(loai == 'V')
			System.out.print("VND");
		if(loai == 'U')
			System.out.print("USD");
		if(loai == 'E')
			System.out.print("Euro");
		System.out.print(", " + "Ti gia: " + tgia);
	}
	
	public String toString() {
		String s = new String();
		s += super.toString() + ", " + "Don gia: " + dgia + ", " + "So luong: " + sluong + ", " + "Loai tien te: ";
		if(loai == 'V')
			s += "VND";
		if(loai == 'U')
			s += "USD";
		if(loai == 'E')
			s += "Euro";
		s += ", " + "Ti gia: " + tgia;
		return s;
	}
	
	public float ttien() {
		return (float) dgia*sluong*tgia;
	}
	public String getMonthAndYear(){
		return super.getMonthAndYear();
	}
	
	public int getMGD() {
		return super.getMGD();
	}

	public static void main(String[] args) {
		GDich ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so giao dich: ");
		int n = sc.nextInt();
		ds = new GDich[n];
		int choice;
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap GD thu " + (i+1) + " [0(GD vang), 1(GD tien te)]: ");
			choice = sc.nextInt();
			if(choice == 0)
				ds[i] = new GDich();
			else
				ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		System.out.println("Danh sach cac giao dich vua nhap: ");
		for(int i = 0; i < n; i++) 
			System.out.println(ds[i]);

		System.out.println("Danh sach ma giao dich tien te co gia tri tren 100000 VND: ");
		for(int i = 0; i < n; i++)
			if(ds[i].ttien() > 100000)
				System.out.println("Ma GD: " + ds[i].getMGD());
		
		//thong ke giao dich theo thang-nam (nang cao)

		HashMap<String, Float> tongTienGD = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(ds[i].ttien() > 0) {
				float tongtien = tongTienGD.getOrDefault(ds[i].getMonthAndYear(), 0.0f);
				tongTienGD.put(ds[i].getMonthAndYear(), tongtien + ds[i].ttien());
			}
		}

		System.out.println("Thong ke so tien cua cac giao dich theo thang-nam: ");
		System.out.println("|-----------|--------------|");
		System.out.println("| Thang/Nam | Tong tien GD |");
		System.out.println("|-----------|--------------|");
		for(String thang_nam : tongTienGD.keySet())
			System.out.printf("|%-11s|%-14.2f|\n", thang_nam, tongTienGD.get(thang_nam));
		System.out.println("|-----------|--------------|");
	}
}

package de02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ChuyenXe {
	private Xe x;
	private int mso;
	private String tenlx, nden;
	private float dthu;
	
	public ChuyenXe() {
		x = new Xe();
		mso = 0;
		tenlx = new String();
		nden = new String();
		dthu = 0.0f;
	}
	
	public ChuyenXe(ChuyenXe c) {
		x = new Xe(c.x);
		mso = c.mso;
		tenlx = new String(c.tenlx);
		nden = new String(c.nden);
		dthu = c.dthu;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		x.nhap();
		System.out.print("Nhap ma so chuyen xe: ");
		mso = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ten nguoi lai xe: ");
		tenlx = sc.nextLine();
		System.out.print("Nhap noi den: ");
		nden = sc.nextLine();
		System.out.print("Nhap doanh thu: ");
		dthu = sc.nextFloat();
		
	}
	
	public void in() {
		x.in();
	System.out.print(", " + "Ma so chuyen xe: " + mso + ", " + "Ten nguoi lai xe: " + tenlx + ", " + "Noi den: " + nden + ", " + "Doanh thu: " + dthu);
	}
	
	public String toString() {
		return x.toString() + ", " + "Ma so chuyen xe: " + mso + ", " + "Ten nguoi lai xe: " + tenlx + ", " + "Noi den: " + nden + ", " + "Doanh thu: " + dthu;
	}
	
	public float getDthu() {
		return dthu;
	}
	
	public Xe getXe() {
		return x;
	}
	
	public float lnhuan() {
		return dthu*0.3f;
	}
	
	public void setDthu(float d) {
		dthu = d;
	}
	
	public int getMS() {
		return mso;
	}
	
	public static void main(String[] args) {
		ChuyenXe ds1[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so chuyen xe: ");
		int m = sc.nextInt();
		ds1 = new ChuyenXe[m];
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap chuyen xe thu " + (i+1) + ": ");
			ds1[i] = new ChuyenXe();
			ds1[i].nhap();
		}
		System.out.println("Danh sach chuyen xe vua nhap: ");
		for(int i = 0; i < m; i++) 
			System.out.println(ds1[i]);
	
		System.out.println("Danh sach ma so chuyen xe bi huy hoac doanh thu duoi 100000: ");
		for(int i = 0; i < m; i++)
			if(ds1[i].getXe().getStatus() == 'K' || ds1[i].getDthu() < 100000)
				System.out.println("Ma so chuyen xe: " + ds1[i].getMS());
		
		HashMap<String, Float> TKLX = new HashMap<>();
		for(int i = 0; i < m; i++) {
			float tongLoiNhuan = TKLX.getOrDefault(String.format("%s-%s", ds1[i].getXe().getLoai(), ds1[i].getXe().getMonthAndYear()), 0.0f);
			TKLX.put(String.format("%s %s", ds1[i].getXe().getLoai(), ds1[i].getXe().getMonthAndYear()), tongLoiNhuan + ds1[i].lnhuan());
		}
			
		System.out.println("Thong ke tong loi nhuan theo tung loai xe theo thang-nam: ");
		System.out.println("|---------|-----------|----------------|");
		System.out.println("| Loai xe | Thang/Nam | Tong loi nhuan |");
		System.out.println("|---------|-----------|----------------|");
		for(String key : TKLX.keySet())
			System.out.printf("|%-9s|%-11s|%-16s|\n", key.split("-")[0], key.split("-")[1], TKLX.get(key));
		System.out.println("|---------|-----------|----------------|");	
	}

}

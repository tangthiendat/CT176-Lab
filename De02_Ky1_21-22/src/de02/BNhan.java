package de02;

import java.util.HashMap;
import java.util.Scanner;

public class BNhan {
	private DVi dvi;
	private String ten, ngay;
	private float cnang;
	
	public BNhan() {
		dvi = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
	}
	
	public BNhan(BNhan b) {
		dvi = new DVi(b.dvi);
		ten = new String(b.ten);
		ngay = new String(b.ngay);
		cnang = b.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin don vi: ");
		dvi.nhap();
		System.out.print("Nhap ho ten benh nhan: ");
		ten = sc.nextLine();
		System.out.print("Nhap ngay nhap vien [dd-mm-yyyy]: ");
		ngay = sc.nextLine();
		System.out.print("Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void xuat() {
		System.out.print(dvi + ", " + "Ten benh nhan: " + ten + ", " + "Ngay nhap vien: " + ngay + ", " + "Can nang: " + cnang);
	}
	
	public String toString() {
		return dvi + ", " + "Ten benh nhan: " + ten + ", " + "Ngay nhap vien: " + ngay + ", " + "Can nang: " + cnang;
	}
	
	public DVi getDvi() {
		return dvi;
	}
	
	public String getTen() {
		return ten;
	}
	
	public String getNgay() {
		return ngay;
	}
	
	public boolean isInRange() {
		int day = Integer.parseInt(ngay.split("-")[0]);
		int month = Integer.parseInt(ngay.split("-")[1]);
		boolean check_t11 = (day >= 1 && day <= 21 && month == 11);
		boolean check_t10 = (day >= 12 && day <= 31 && month == 10);
		return check_t11 || check_t10;
	}
	
	
	public static void main(String[] args) {
		BNhan bn[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so benh nhan: ");
		int m = sc.nextInt();
		bn = new BNhan[m];
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap benh nhan thu " + (i+1)+ ":");
			bn[i] = new BNhan();
			bn[i].nhap();
		}
		System.out.println("Danh sach benh nhan vua nhap:");
		for(int i = 0; i < m; i++)
			System.out.println(bn[i]);
		
		System.out.println("Tim ma don vi dieu tri benh nhan ten Tran Anh Hao nhap vien ngay 21/11/2021: ");
		boolean found = false;
		int i =0;
		while(i < m && !found) {
			if(bn[i].getTen().equalsIgnoreCase("Tran Anh Hao") && bn[i].getNgay().equals("21/11/2021")) {
				found = true;
				System.out.println("Ma don vi: " + bn[i].getDvi().getMDV());
			}
			else
				i++;
		}
		if(!found)
			System.out.println("Khong tim thay ma don vi phu hop trong danh sach don vi");
		
		System.out.println("Cac don vi co so benh nhan nhap vien nhieu nhat trong vong 40 ngay tinh den 21/11/2021: ");
		HashMap <String, Integer> TKBN = new HashMap<>();
		for (i = 0; i < m; i++) {
			if(bn[i].isInRange()) {
				int so_bn = TKBN.getOrDefault(bn[i].getDvi().getTendv(), 0);
				TKBN.put(bn[i].getDvi().getTendv(), so_bn+1);
			}
		}
		int max_bn = 0;
		for(String tendv : TKBN.keySet()) {
			if(TKBN.get(tendv) > max_bn)
				max_bn = TKBN.get(tendv);
		}
		
		for(String tendv : TKBN.keySet()) {
			if(TKBN.get(tendv) == max_bn)
				System.out.println(tendv);
		}
	}

}

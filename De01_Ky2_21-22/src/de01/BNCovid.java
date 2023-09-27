package de01;

import java.util.Scanner;

public class BNCovid extends BNhan {
	private String ngay, odich, noi;
	private char loai;
	
	public BNCovid() {
		super();
		ngay = new String();
		loai = '0';
		odich = new String();
		noi = new String();
	}
	
	public BNCovid(BNCovid b) {
		super(b);
		ngay = new String(b.ngay);
		loai = b.loai;
		odich = new String(b.odich);
		noi = new String(b.noi);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay cach ly [dd-mm-yyyy]: ");
		ngay = sc.nextLine();
		System.out.print("Nhap loai [0(F0), 1(F1), 2(F2),...]: ");
		loai = sc.nextLine().charAt(0);
		System.out.print("Nhap o dich: ");
		odich =sc.nextLine();
		System.out.print("Nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.print(", " + "Ngay cach ly: " + ngay + ", " + "Loai: " + "F" + loai + ", " + "O dich: " + odich + ", " + "Noi cach ly: " + noi);
	}
	
	public String toString() {
		return super.toString() + ", " + "Ngay cach ly: " + ngay + ", " + "Loai: " + "F" + loai + ", " + "O dich: " + odich + ", " + "Noi cach ly: " + noi;
	}
	
	public char getLoai() {
		return loai;
	}
	
	public String getOdich() {
		return odich;
	}
	
	public String getHten() {
		return super.getHten();
	}
	
	public String getNgay() {
		return ngay;
	}
	
	public boolean hetCachLy(){
		int day = Integer.parseInt(ngay.split("-")[0]);
		int month = Integer.parseInt(ngay.split("-")[1]);
		int year = Integer.parseInt(ngay.split("-")[2]);
		if(year < 2021 || year == 2021 && month < 5 || year == 2021 && month == 5 && day <= 3)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		BNhan ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so benh nhan: ");
		int n = sc.nextInt();
		ds = new BNhan[n];
		int choice;
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap benh nhan thu " + (i+1) + " [0(BNhan), 1(BNCovid)]: ");
			choice = sc.nextInt();
			if(choice == 0)
				ds[i] = new BNhan();
			else
				ds[i] = new BNCovid();
			ds[i].nhap();
		}
		
		System.out.println("Danh sach benh nhan vua nhap la: ");
		for(int i = 0; i < n; i++)
			System.out.println(ds[i]);
		
		System.out.println("Ho ten cac benh nhan Covid loai F1 tai o dich Cong ty Hosiden: ");
		boolean found = false;
		int i = 0;
		while(i < n && ds[i].getLoai() != 'x' && !found) {
			if(ds[i].getLoai() == '1' && ds[i].getOdich().equals("Cong ty Hosiden")){
				found = true;
				System.out.println(ds[i].getHten());
			}
			else
				i++;
		}
		if(!found)
			System.out.println("Khong tim thay benh nhan phu hop trong danh sach benh nhan");
		System.out.println("Cac benh nhan Covid-19 het thoi gian cach ly truoc 18-05-2021 la: ");
		for(i = 0; i < n; i++) {
			if(ds[i].hetCachLy())
					System.out.println(ds[i].getHten());
		}
	}

}

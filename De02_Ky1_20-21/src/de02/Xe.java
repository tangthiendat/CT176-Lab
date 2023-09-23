package de02;
import java.util.Scanner;
public class Xe {
	private String soxe, loai, ngay;
	private char tthai;
	
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'C';
	}
	
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe: ");
		soxe = sc.nextLine();
		System.out.print("Nhap loai xe: ");
		loai = sc.nextLine();
		System.out.print("Nhap ngay dang kiem [dd-mm-yyyy]: ");
		ngay = sc.nextLine();
		do {
			System.out.print("Nhap trang thai [C(Cho phep), K(Khong cho phep)]: ");
			tthai = sc.nextLine().charAt(0);
			if(tthai != 'C' && tthai != 'K')
				System.out.println("Trang thai khong hop le. Hay nhap lai!");
		}while(tthai != 'C' && tthai != 'K');
	}
	
	public void in() {
		System.out.print("So xe: " + soxe + ", " + "Loai xe: " + loai + ", " + "Ngay dang kiem: " + ngay + ", " + "Luu hanh: ");
		if(tthai == 'C')
			System.out.print("Cho phep");
		else
			System.out.print("Khong cho phep");
	}
	
	public String toString() {
		String s = new String();
		s += "So xe: " + soxe + ", " + "Loai xe: " + loai + ", " + "Ngay dang kiem: " + ngay + ", " + "Luu hanh: ";
		if(tthai == 'C')
			s += "Cho phep";
		else if(tthai == 'K')
			s += "Khong cho phep";
		return s;
	}
	
	public char getStatus() {
		return tthai;
	}
	
	public String getMonthAndYear() {
		int month = Integer.parseInt(ngay.split("-")[1]);
		int year = Integer.parseInt(ngay.split("-")[2]);
		return month + "-" + year;
	}
	
	public String getLoai() {
		return loai;
	}
	
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		x1.in();
		System.out.println("");
		Xe x2 = new Xe(x1);
		System.out.println(x2);
	}


}

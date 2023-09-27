package de02;

import java.util.HashMap;
import java.util.Scanner;

public class Xe {
	private DCo d;
	private String so,ten;
	private long gia;
	private char tthai;
	
	public Xe() {
		d = new DCo();
		so = new String();
		ten = new String();
		gia = 0;
		tthai = 'C';
	}
	
	public Xe(Xe x) {
		d = new DCo(x.d);
		so = new String(x.so);
		ten = new String(x.ten);
		gia = x.gia;
		tthai = x.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin dong co: ");
		d.nhap();
		System.out.print("Nhap so xe: ");
		so = sc.nextLine();
		System.out.print("Nhap ten chu xe: ");
		ten = sc.nextLine();
		System.out.print("Nhap gia: ");
		gia = sc.nextLong();
		sc.nextLine();
		do {
			System.out.print("Nhap trang thai luu hanh [C(co), K(khong)]: ");
			tthai = sc.nextLine().charAt(0);
			if(tthai != 'C' && tthai != 'K')
				System.out.println("Trang thai khong hop le. Hay nhap lai!");
		}while(tthai != 'C' && tthai != 'K');

	}
	
	public void in() {
		System.out.print(d + ", " + "So xe: " + so + ", " + "Ten chu xe: " + ten + ", " + "Gia: " + gia + ", " + "Luu hanh: ");
		if(tthai == 'C')
			System.out.print("Co");
		else
			System.out.print("Khong");
	}
	
	public String toString() {
		String s = new String();
		s += d + ", " + "So xe: " + so + ", " + "Ten chu xe: " + ten + ", " + "Gia: " + gia + ", " + "Luu hanh: ";
		if(tthai == 'C')
			s += "Co";
		else
			s += "Khong";
		return s;
	}
	
	public char getTThai() {
		return tthai;
	}
	
	public long getGia() {
		return gia;
	}
	
	public String getSo() {
		return so;
	}
	
	public DCo getDCo() {
		return d;
	}
	
	public long phitruocba() {
		return (long) gia*10/100;
	}
	
	public boolean isInRange() {
		int month = Integer.parseInt(d.getNgay().split("-")[1]);
		int year = Integer.parseInt(d.getNgay().split("-")[2]);
		if(year < 2000 || year == 2000 && month < 10)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Xe ds1[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong xe: ");
		int m = sc.nextInt();
		ds1 = new Xe[m];
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap thong tin xe thu " + (i+1) + ":");
			ds1[i] = new Xe();
			ds1[i].nhap();
		}
		
		System.out.println("Danh sach xe vua nhap: ");
		for(int i = 0; i < m; i++)
			System.out.println(ds1[i]);
		
		System.out.println("Danh sach xe bi thu hoi hoac co gia duoi 10000000: ");
		for(int i = 0; i < m; i++)
			if(ds1[i].getTThai() == 'K' || ds1[i].getGia() < 10000000)
				System.out.println(ds1[i].getSo());
		
		System.out.println("Thong ke tong phi truoc ba theo tung loai dong co duoc san xuat truoc thang 10 nam 2000: ");
		HashMap <String, Long> TKDC = new HashMap<>();
		for(int i = 0; i < m; i++)
			if(ds1[i].isInRange()) {
				long tongPhiTruocBa = TKDC.getOrDefault(ds1[i].getDCo().getTen(), 0L);
				TKDC.put(ds1[i].getDCo().getTen(), tongPhiTruocBa + ds1[i].phitruocba());
			}
		System.out.println("|-------------|-------------------|");
		System.out.println("| Ten dong co | Tong phi truoc ba |");
		System.out.println("|-------------|-------------------|");
		for(String ten_dco : TKDC.keySet())
			System.out.printf("|%-13s|%-19d|\n", ten_dco, TKDC.get(ten_dco));
		System.out.println("|-------------|-------------------|");
	
	}

}

package buoi2.date;
import java.util.Scanner;
public class SDDate {
	public static void main(String[] args) {
		Date a = new Date(15,2,2023);
		a.hienThi();
		Date b = new Date();
		b.nhap();
		System.out.print("Ngay vua nhap: ");
		b.hienThi();
		Date homsau = new Date();
		homsau = a.ngayHomSau();
		System.out.print("Ngay hom sau cua ngay 15/2/2023 la: ");
		homsau.hienThi();
		Date n = new Date();
		n = a.cong(20);
		System.out.print("20 ngay ke tu 15/2/2023 la ngay: ");
		n.hienThi();
	}
}

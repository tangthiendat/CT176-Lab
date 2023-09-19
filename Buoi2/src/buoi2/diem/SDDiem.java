package buoi2.diem;
import java.util.Scanner;
public class SDDiem {
	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.print("Diem A: ");
		a.hienThi();
		Diem b = new Diem();
		System.out.println("Nhap diem B: ");
		b.nhap();
		System.out.print("Diem B: ");
		b.hienThi();
		Diem c = new Diem(-b.giaTriX(), -b.giaTriY());
		System.out.print("Diem doi xung cua diem B qua O la: ");
		c.hienThi();
		System.out.println("Khoang cach BO = "+ b.khoangCach());
		System.out.println("Khoang cach AB = "+ a.khoangCach(b));
	}
}

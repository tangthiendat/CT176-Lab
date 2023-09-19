package buoi3.doanthang;
import buoi2.diem.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem a = new Diem(2,5);
		Diem b = new Diem(20,35);
		DoanThang ab = new DoanThang(a.giaTriX(), a.giaTriY(), b.giaTriX(), b.giaTriY());
		System.out.print("Doan thang AB: ");
		ab.hienThi();
		ab.tinhTien(5,3);
		System.out.print("Tinh tien AB mot doan (5,3): " + ab);
		DoanThang cd = new DoanThang();
		System.out.println("Nhap doan thang CD:");
		cd.nhap();
		System.out.println("Chieu dai doan thang CD: " + cd.doDai());
		System.out.println("Goc giua CD va truc hoanh: "+ cd.gocVoiTrucHoanh());
	}
}

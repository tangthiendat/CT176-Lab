package buoi4.diemmau;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10, "Trang");
		System.out.print("Diem A: ");
		A.hienThi();
		DiemMau B = new DiemMau();
		System.out.println("Nhap diem B:");
		B.nhap();
		B.doiDiem(10,8);
		System.out.println("Diem B sau khi doi mot doan (10,8) la: " + B);
		B.GanMau("Vang");
		System.out.print("Diem B sau khi doi mau: "+ B);
	}
}

package buoi3;
import buoi2.Diem;

public class DoanThang {
	private Diem d1,d2;
	public DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem a, Diem b){
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public DoanThang(int ax, int ay, int bx, int by){
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public void nhap(){
		System.out.println("Nhap toa do d1:");
		d1.nhap();
		System.out.println("Nhap toa do d2:");
		d2.nhap();
	}
	public void hienThi(){
		System.out.println("[" + d1 + "," + d2 + "]");
	}
	public String toString(){
		return ("[" + d1 + "," + d2 + "]");
	}
	public double doDai(){
		return d1.khoangCach(d2);
	}
	public void tinhTien(int dx, int dy){
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public int gocVoiTrucHoanh(){
		int x = d2.giaTriX() - d1.giaTriX();
		int y = d2.giaTriY() - d1.giaTriY();
		return (int) Math.round(Math.atan2(y, x)* 180/Math.PI);
	}
}

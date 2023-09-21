package buoi4.diemmau;

import buoi2.Diem;
import java.util.Scanner;
public class DiemMau extends Diem{
	private String mau;
	public DiemMau(){
		super();
		mau = new String();
	}
	public DiemMau(int x, int y, String mau){
		super(x,y);
		this.mau = new String(mau);
	}
	public void GanMau(String mau){
		this.mau = mau;
	}
	public void hienThi(){
		super.hienThi();
		System.out.println(", voi mau: " + mau);
	}
	public String toString(){
		return super.toString() + ", voi mau: " + mau;
	}
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mau cua diem: ");
		mau = sc.nextLine();
	}
	public void doiDiem(int dx, int dy){
		super.doiDiem(dx, dy);
	}
}

package buoi5.hoadon;
import java.util.Scanner;
public class ChiTiet {
	HangHoa h;
	private int soluong;
	private long dongia;
	
	public ChiTiet(){
		h = new HangHoa();
		soluong = 0;
		dongia = 0;
	}
	
	public ChiTiet(ChiTiet c){
		h = new HangHoa(c.h);
		soluong = c.soluong;
		dongia = c.dongia;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin hang hoa:");
		h.nhap();
		System.out.print("Nhap so luong: ");
		soluong = sc.nextInt();
		System.out.print("Nhap don gia: ");
		dongia = sc.nextLong();
	}
	
	public void in(){
		System.out.print("[");
		h.in();
		System.out.print(", " + "So luong: " + soluong + ", " + "Don gia: " + dongia + ", " + "Thanh tien: " + thanhtien() + "]");
	}
	
	public String toString(){
		return "[" + h.toString() + ", " + "So luong: " + soluong + ", " + "Don gia: " + dongia + ", " + "Thanh tien: " + thanhtien() + "]";
	}
	public long thanhtien(){
		return dongia*soluong;
	}
}

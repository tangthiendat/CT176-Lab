package buoi5.hoadon;
import java.util.Scanner;
public class KhachHang {
	private String mso, hten;
	private boolean gtinh;
	
	public KhachHang(){
		mso = new String();
		hten = new String();
		gtinh = true;
	}
	
	public KhachHang(KhachHang k){
		mso = new String(k.mso);
		hten = new String(k.hten);
		gtinh = k.gtinh;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		mso = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap gioi tinh [Nam (true), Nu (false)]: ");
		gtinh = sc.nextBoolean();
	}
	
	public void in(){
		System.out.print("Ma so: " + mso + ", " + "Ho ten: " + hten + ", " +"Gioi tinh: "+ gtinh);
	}
	
	public String toString(){
		return "Ma so: " + mso + ", " + "Ho ten: " + hten + ", " +"Gioi tinh: "+ gtinh;
	}
	public float layTiLeGiam(){
		return 0.0f;
	}
}

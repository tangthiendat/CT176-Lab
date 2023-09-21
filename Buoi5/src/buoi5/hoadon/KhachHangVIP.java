package buoi5.hoadon;
import java.util.Scanner;
public class KhachHangVIP extends KhachHang {
	private float tiLeGiam;
	public KhachHangVIP(){
		super();
		tiLeGiam = 0.0f;
	}
	
	public KhachHangVIP(KhachHangVIP k){
		super(k);
		tiLeGiam = k.tiLeGiam;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ti le giam: ");
		tiLeGiam = sc.nextFloat();
	}
	
	public void in(){
		super.in();
		System.out.print(", " + tiLeGiam);
	}
	
	public String toString(){
		return super.toString() + ", " + tiLeGiam;
	}
	
	public float layTiLeGiam(){
		return tiLeGiam;
	}
}

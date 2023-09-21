package buoi5.hoadon;
import java.util.Scanner;
public class HangHoa {
	private String mso, ten, nsxuat;
	public HangHoa (){
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	
	public HangHoa(HangHoa h){
		mso = new String(h.mso);
		ten = new String(h.ten);
		nsxuat = new String(h.nsxuat);
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hang hoa: ");
		mso = sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.print("Nhap nha san xuat: ");
		nsxuat = sc.nextLine();
	}
	
	public void in(){
		System.out.print("Ma so HH: " + mso + ", " + "Ten HH: " + ten + ", " + "Nha SX: " + nsxuat);
	}
	
	public String toString(){
		return "Ma so HH: " + mso + ", " + "Ten HH: " + ten + ", " + "Nha SX: " + nsxuat;
	}
	
	
}

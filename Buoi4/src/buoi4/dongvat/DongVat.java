package buoi4.dongvat;
import java.util.Scanner;
public abstract class DongVat {
	private String giong, maulong;
	private float cannang;
	public abstract void Keu();
	public DongVat(){
		giong = new String();
		maulong = new String();
		cannang = 0.0f;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau long: ");
		maulong = sc.nextLine();
		System.out.print("Nhap can nang: ");
		cannang = sc.nextFloat();
	}
	
	public String toString(){
		return "[" + giong + ", " + maulong + ", " + cannang + "]";
	}
}

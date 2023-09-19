package buoi1.basic;
import java.util.Scanner;
public class LayTen {
	public String layTen(String hoten) {
		hoten = hoten.trim();
		int p = hoten.lastIndexOf(" ");
		String ten = hoten.substring(p+1);
		return ten;
	}
	public static void main(String args[]) {
		LayTen t = new LayTen();
		Scanner sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		String ten = t.layTen(hoten);
		System.out.print(ten);
	}
}

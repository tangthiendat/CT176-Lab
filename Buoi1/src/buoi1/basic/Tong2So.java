package buoi1.basic;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
public class Tong2So {
	public int nhap() throws IOException {
		Scanner sc = new Scanner(Path.of("tong2so.txt"), StandardCharsets.UTF_8);
		String s = new String();
		int                                                                                                                                 n = 0;
		do {
			s = sc.nextLine();
			try {n = Integer.parseInt(s);}
			catch(NumberFormatException x) {
				n = Integer.MAX_VALUE;
				System.out.print("Lỗi! Hãy nhập lại.");
			}
		}
		while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String args[]) throws IOException{
		Tong2So t = new Tong2So();
		System.out.print("Nhap a: ");
		int a = t.nhap();
		System.out.print("Nhap b: ");
		int b = t.nhap();
		System.out.print("Sum: " + (a+b));
	}
}
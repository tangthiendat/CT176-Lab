package buoi1.basic;
import java.util.Scanner;
public class TongDSo {
	public static void main(String agrs[]) {
		float s = 0.0f, f, max = Float.MIN_VALUE;
		for(String e: agrs) {
			try {f = Float.parseFloat(e);}
			catch(NumberFormatException x) {
				f = 0.0f;
			}
			s += f;
			if(f > max) 
				f = max;
		}
		System.out.print("Max =" + max + "\nTong = ");
	}
}

package buoi1.basic;
import java.util.Scanner;
public class PTBac2 {
	public static void giaiPTBac1(double a, double b) {
		if(a == 0) {
			if(b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		}
		else
			System.out.println("Nghiệm của phương trình là x = " + (-b/a));
	}
	public static void giaiPTBac2(double a, double b, double c) {
		double delta = Math.pow(b,2) - 4*a*c;
		if(delta < 0)
			System.out.println("Phương trình vô nghiệm");
		else if(delta == 0)
			System.out.println("Phương trình có nghiệm kép x = " + (-b/(2*a)));
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a == 0)
			PTBac2.giaiPTBac1(a, b);
		else
			PTBac2.giaiPTBac2(a, b, c);
		}
}
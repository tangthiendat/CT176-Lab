package buoi4.dongvat;
import java.util.Scanner;
public class SDDongVat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so con vat: ");
		int n = sc.nextInt();
		DongVat ds[] = new DongVat[n];
		int choice = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Nhap con vat thu "+ (i+1) + " la Bo(1) , Heo(2), De(3) hay Ga(4): ");
			choice = sc.nextInt();
			if(choice == 1)
				ds[i] = new Bo();
			else if(choice == 2)
				ds[i] = new Heo();
			else if(choice == 3)
				ds[i] = new De();
			else if(choice == 4)
				ds[i] = new Ga();
			ds[i].nhap();
		}
		for(DongVat d : ds){
			System.out.println(d);
			d.Keu();
		}
	}
}

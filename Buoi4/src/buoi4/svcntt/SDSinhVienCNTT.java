package buoi4.svcntt;
import java.util.Scanner;
public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so SVCNTT: ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i = 0; i < n; i++){
			System.out.println("Nhap SVCNTT thu " + (i+1) + ";");
			ds[i] = new SinhVienCNTT();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach SV vua nhap: ");
		for(SinhVienCNTT s : ds)
			System.out.println(s);
		sc.nextLine();
		String email = new String();
		System.out.print("Nhap email cua SV can tim: ");
		email = sc.nextLine();
		for(SinhVienCNTT s : ds){
			if(s.getEmail().equals(email))
				System.out.println("User: " + s.getUser() + ", diem TB: " + s.diemTB());
		}
		
	}
}

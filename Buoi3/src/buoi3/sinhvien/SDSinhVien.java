package buoi3.sinhvien;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		a.nhap();
		a.nhapDiem();
		System.out.println("Them mon LTHDT");
		a.themHP("LTHDT", "C");
		System.out.println("Thong tin SV a: " + a);
		System.out.println("DANH SACH SINH VIEN");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for(int i = 0; i < n; i++){
			System.out.println("Nhap SV thu " + (i+1)+ ":");
			ds[i] = new SinhVien();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach SV vua nhap: ");
		for(int i = 0; i < n; i++)
			System.out.println(ds[i]);
		float maxTB = ds[0].diemTB();
		int maxIndex = 0;
		for(int i = 0; i < n; i++){
			if(ds[i].diemTB() > maxTB){
				maxTB = ds[i].diemTB();
				maxIndex = i; 
			}
		}
		System.out.println("SV co diem TB cao nhat:\n" + ds[maxIndex]);
		System.out.println("Danh sach cac SV bi canh bao hoc vu: ");
		for(int i = 0; i < n; i++){
			if(ds[i].diemTB() < 1)
				System.out.println(ds[i]);
		}
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0){
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		System.out.println("Danh sach SV sap xep theo ten:");
		for(int i = 0; i < n; i++)
			System.out.println(ds[i]);
		int XuatSac = 0, Gioi = 0, Kha = 0, TrungBinh = 0, Yeu = 0, Kem = 0;
		for(int i = 0; i < n; i++){
			if(ds[i].diemTB() >= 3.6 && ds[i].diemTB() <= 4)
				XuatSac++;
			else if(ds[i].diemTB() >= 3.2 && ds[i].diemTB() < 3.6)
				Gioi++;
			else if(ds[i].diemTB() >= 2.5 && ds[i].diemTB() < 3.2)
				Kha++;
			else if(ds[i].diemTB() >= 2 && ds[i].diemTB() < 2.5)
				TrungBinh++;
			else if(ds[i].diemTB() >= 1 && ds[i].diemTB() < 2)
				Yeu++;
			else if(ds[i].diemTB() >= 0 && ds[i].diemTB() < 1)
				Kem++;
		}
		System.out.println("===THONG KE===");
		System.out.println("Xuat sac: " + XuatSac);
		System.out.println("Gioi: " + Gioi);
		System.out.println("Kha: " + Kha);
		System.out.println("Trung binh: " + TrungBinh);
		System.out.println("Yeu: " + Yeu);
		System.out.println("Kem: " + Kem);
	}
	
}

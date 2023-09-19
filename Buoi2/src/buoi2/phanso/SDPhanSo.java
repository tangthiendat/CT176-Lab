package buoi2.phanso;
import java.util.Scanner;
public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		System.out.print("a = ");
		a.hienThi();
		System.out.print("\nb = ");
		b.hienThi();
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("\nNhap phan so x:");
		x.nhap();
		System.out.println("Nhap phan so y: ");
		y.nhap();
		PhanSo nd = new PhanSo();
		nd = x.giaTriNghichDao();
		System.out.print("Gia tri nghich dao cua x: ");
		nd.hienThi();
		PhanSo tong = new PhanSo();
		tong = x.cong(y);
		System.out.print("x + y = ");
		tong.hienThi();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so phan tu n = ");
		int n = sc.nextInt();
		PhanSo ds[] = new PhanSo[n];
		PhanSo sum = new PhanSo();
		PhanSo max = new PhanSo();
		for(int i = 0; i < n; i++)
			ds[i] = new PhanSo();
		for(int i = 0; i < n; i++){
			System.out.println("Nhap phan so thu " + (i+1) + ":");
			ds[i].nhap();
			sum = sum.cong(ds[i]);
			if(ds[i].lonHon(max))
				max = ds[i];
		}
		System.out.println("Cac phan so vua nhap la: ");
		for(PhanSo e : ds)
			e.hienThi();
		System.out.print("\nTong cac phan so: ");
		sum.hienThi();
		System.out.print("\nPhan so lon nhat: ");
		max.hienThi();
		PhanSo temp = new PhanSo();
		for(int i = 0; i < n-1; i++)
			for(int j = i+1; j < n; j++)
				if(ds[i].lonHon(ds[j])){
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
		System.out.println("\nDanh sach sau khi sap xep la: ");
		for(PhanSo e : ds)
			e.hienThi();
	}
}

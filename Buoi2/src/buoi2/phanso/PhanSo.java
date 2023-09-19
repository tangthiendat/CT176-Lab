package buoi2.phanso;
import java.util.Scanner;
public class PhanSo {
	private int tu,mau;
	public PhanSo(){
		tu = 0; 
		mau = 1;
	}
	public PhanSo(int tu, int mau){
		this.tu = tu;
		this.mau = mau;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap tu: ");
			tu = sc.nextInt();
			System.out.print("Nhap mau: ");
			mau = sc.nextInt();
			if(mau == 0)
				System.out.print("Loi. Nhap lai!");
		}while(mau == 0);
	}
	public void hienThi(){
		if(tu == 0)
			System.out.println("0");
		else if(mau == 1)
			System.out.println(tu);
		else
			System.out.print(tu + "/" + mau + " ");
	}
	public void nghichDao(){
		int temp = tu;
		tu = mau;
		mau = temp;
	}
	public PhanSo giaTriNghichDao(){
		PhanSo nd = new PhanSo();
		nd.tu = mau;
		nd.mau = tu;
		return nd;
	}
	public double giaTri(){
		return (double) tu/mau;
	}
	public boolean lonHon(PhanSo a){
		PhanSo p = new PhanSo(tu,mau);
		return p.giaTri() > a.giaTri(); 
	}
	PhanSo cong(PhanSo a){
		PhanSo tong = new PhanSo();
		if(mau == a.mau){
			tong.tu = tu + a.tu;
			tong.mau = mau;
		}
		else{
			tong.tu = tu*a.mau + a.tu*mau;
			tong.mau = mau*a.mau;
		}
		return tong;
	}
	PhanSo tru(PhanSo a){
		PhanSo hieu = new PhanSo();
		if(mau == a.mau){
			hieu.tu = tu - a.tu;
			hieu.mau = mau;
		}
		else{
			hieu.tu = tu*a.mau - a.tu*mau;
			hieu.mau = mau*a.mau;
		}
		return hieu;
	}
	PhanSo nhan(PhanSo a){
		PhanSo tich = new PhanSo();
		tich.tu = tu*a.tu;
		tich.mau = mau*a.mau;
		return tich;
	}
	PhanSo chia(PhanSo a){
		PhanSo p = new PhanSo(tu,mau);
		return p.nhan(a.giaTriNghichDao());
	}
	PhanSo cong(int a){
		PhanSo tong = new PhanSo();
		tong.tu = tu + a*mau;
		tong.mau = mau;
		return tong;
	}
	PhanSo tru(int a){
		PhanSo hieu = new PhanSo();
		hieu.tu = tu - a*mau;
		hieu.mau = mau;
		return hieu;
	}
	PhanSo nhan(int a){
		PhanSo tich = new PhanSo();
		tich.tu = tu*a;
		tich.mau = mau;
		return tich;
	}
	PhanSo chia(int a){
		PhanSo thuong = new PhanSo();
		thuong.tu = tu;
		thuong.mau = mau*a;
		return thuong;
	}
	
}

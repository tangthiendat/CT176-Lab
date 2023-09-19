package buoi2.date;
import java.util.Scanner;
public class Date {
	private int ngay,thang,nam;
	public Date(){
		ngay = 1;
		thang = 1;
		nam = 2023;
	}
	public Date(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public Date(Date d){
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public void hienThi(){
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	public String toString(){
		return (ngay + "/" + thang + "/" + nam);
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe())
				System.out.println("Ngay khong hop le. Nhap lai!");
		}while(!hopLe());
	}
	public boolean hopLe(){
		int maxDay[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam % 4 == 0)
			maxDay[2] = 29;
		if(nam > 0 && thang >= 1 && thang <= 12 && ngay >= 1 && ngay <= maxDay[thang])
			return true;
		return false;
	}
	public Date ngayHomSau(){
		Date n = new Date(ngay,thang,nam);
		n.ngay++;
		if(!n.hopLe()){
			n.ngay = 1;
			n.thang++;
			if(!n.hopLe()){
				n.thang = 1;
				n.nam++;
			}
		}
		return n;
	}
	public Date cong(int n){
		Date d = new Date(ngay,thang,nam);
		for(int i = 1; i <= n; i++)
			d = d.ngayHomSau();
		return d;
	}
}

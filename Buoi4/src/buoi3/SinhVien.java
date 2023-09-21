package buoi3;
import buoi2.Date;
import java.util.Scanner;
public class SinhVien {
	private String mssv,  hoten;
	private Date ngaysinh;
	private int sohp;
	private String hocphan[], diem[];
	private final int MAX = 50;
	public SinhVien(){
		mssv = new String();
		hoten = new String();
		ngaysinh = new Date();
		sohp = 0;
		hocphan = new String[MAX];
		diem = new String[MAX];
	}
	
	public SinhVien (SinhVien s){
		mssv = new String(s.mssv);
		hoten = new String(s.hoten);
		sohp = s.sohp;
		hocphan = new String[MAX];
		diem = new String[MAX];
		for(int i = 0; i < sohp; i++){
			hocphan[i] = new String(s.hocphan[i]);
			diem[i] = new String(s.diem[i]);
		}
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		mssv = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaysinh.nhap();
	}
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hoc phan: ");
		sohp = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < sohp; i++){
			System.out.print("Nhap hoc phan thu " +(i+1) + ": " );
			hocphan[i] = sc.nextLine();
			System.out.print("Nhap diem hoc phan thu "+ (i+1) + ": ");
			diem[i] = sc.nextLine();
		}
	}
	public void themHP(String hp, String d){
		if(sohp < MAX){
			hocphan[sohp] = new String(hp);
			diem[sohp] = new String(d);
			sohp++;
		}
		else
			System.out.println("Loi. Danh sach day!");
	}
	public void xoaHP(String hp){
		int i;
		for(i = 0; i < sohp; i++){
			if(hocphan[i].equals(hp))
				break;
		}
		if(i < sohp){
			for(int j = 1; j < sohp-1; j++){
				hocphan[j] = hocphan[j+1];
				diem[j] = diem[j+1];
			}
		}
		else
			System.out.println("Khong tim thay hoc phan " + hp);
	}
	public String toString(){
		String s = "MSSV: " + mssv + "," + "Ho ten: " + hoten +  "," + "Ngay sinh: " + ngaysinh + "," + "So HP da hoc: " + sohp +","+ "Diem cac HP: ";
		for(int i = 0; i < sohp; i++){
			s += "(" + hocphan[i] + "," + diem[i] + ")";
			if(i != sohp - 1)
				s += ",";
		}
		return s;
	}
	public float diemTB(){
		float tongDiem = 0.0f;
		for(int i = 0; i < sohp; i++){
			if(diem[i].equals("A"))
				tongDiem += 4;
			if(diem[i].equals("B+"))
				tongDiem += 3.5;
			if(diem[i].equals("B"))
				tongDiem += 3;
			if(diem[i].equals("C+"))
				tongDiem += 2.5;
			if(diem[i].equals("C"))
				tongDiem += 2;
			if(diem[i].equals("D+"))
				tongDiem += 1.5;
			if(diem[i].equals("D"))
				tongDiem += 1;
			if(diem[i].equals("F"))
				tongDiem += 0;
			
		}
		return tongDiem/sohp;
	}
	public String layTen(){
		return hoten.substring(hoten.lastIndexOf(" ") + 1);
	}
}

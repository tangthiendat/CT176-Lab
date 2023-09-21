package buoi4.svcntt;

import buoi3.SinhVien;
import java.util.Scanner;
public class SinhVienCNTT extends SinhVien{
	private String user, pass, email;
	public SinhVienCNTT(){
		super();
		user = new String();
		pass = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT s){
		super(s);
		user = new String(s.user);
		pass = new String(s.pass);
		email = new String(s.email);
	}
	
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap user: ");
		user = sc.nextLine();
		System.out.print("Nhap password: ");
		pass = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}
	public String toString(){
		return super.toString() + ", user: " + user + ", email: " + email;
	}
	public void doiPass(String pass){
		this.pass = pass;
	}
	public String getEmail(){
		return email;
	}
	public String getUser(){
		return user;
	}
}

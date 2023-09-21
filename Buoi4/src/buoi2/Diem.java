package buoi2;
import java.util.Scanner;
public class Diem {
	private int x,y;
	public Diem(){
		x = 0;
		y = 0;
	}
	public Diem(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Diem(Diem d){
		x = d.x;
		y = d.y;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x = ");
		x = sc.nextInt();
		System.out.print("Nhap y = ");
		y = sc.nextInt();
	}
	public void hienThi(){
		System.out.print("(" + x + "," + y + ")");
	}
	public String toString(){
		return ("(" + x + "," + y + ")");
	}
	public void doiDiem(int dx, int dy){
		x += dx;
		y += dy;
	}
	public int giaTriX(){
		return x;
	}
	public int giaTriY(){
		return y;
	}
	public double khoangCach(){
		return (double) Math.sqrt(x*x+y*y);
	}
	public double khoangCach(Diem d){
		return (double) Math.sqrt(Math.pow(x-d.x, 2) + Math.pow(y-d.y,2));
	}
}

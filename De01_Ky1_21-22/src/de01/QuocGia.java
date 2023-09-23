package de01;

import java.util.Scanner;

public class QuocGia {
	private String msqg, tenqgia, tenthudo;
	private float GDP;
	
	public QuocGia() {
		msqg = new String();
		tenqgia = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}
	public QuocGia(QuocGia q) {
		msqg = new String(q.msqg);
		tenqgia = new String(q.tenqgia);
		tenthudo = new String(q.tenthudo);
		GDP = q.GDP;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.print("Nhap ten quoc gia: ");
		tenqgia = sc.nextLine();
		System.out.print("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.print("Nhap GDP: ");
		GDP = sc.nextFloat();
	}
	
	public void in() {
		System.out.print("Ma so QG: " + msqg + ", " + "Ten QG: " + tenqgia + ", " + "Ten thu do: " + tenthudo + ", " + "GDP: " + GDP);
	}
	
	public String toString() {
		return "Ma so QG: " + msqg + ", " + "Ten QG: " + tenqgia + ", " + "Ten thu do: " + tenthudo + ", " + "GDP: " + GDP;
	}
	
	public char getChauLuc() {
		return 'X';
	}
	
	public float getGDP() {
		return GDP;
	}
	
	public String getTenQG() {
		return tenqgia;
	}
	
	
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		System.out.println("\n" + qg2);

	}

}

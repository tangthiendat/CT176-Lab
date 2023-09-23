package de01;

import java.util.HashMap;
import java.util.Scanner;

public class QuocGiaPT extends QuocGia {
	private float ttho, dtich;
	private char chluc;
	
	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		chluc = 'X';
		dtich = 0.0f;
	}
	
	public QuocGiaPT(QuocGiaPT q) {
		super(q);
		ttho = q.ttho;
		chluc = q.chluc;
		dtich = q.dtich;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tuoi tho: ");
		ttho = sc.nextFloat();
		sc.nextLine();
		do {
			System.out.print("Nhap chau luc [A(A), W(Au), M(My), U(Uc), P(Phi)]: ");
			chluc = sc.nextLine().charAt(0);
			if(chluc != 'A' && chluc != 'W' && chluc != 'M' && chluc != 'U' && chluc != 'P')
				System.out.println("Chau luc khong hop le. Hay nhap lai!");
		}while(chluc != 'A' && chluc != 'W' && chluc != 'M' && chluc != 'U' && chluc != 'P');
		System.out.print("Nhap dien tich: ");
		dtich = sc.nextFloat();
	}
	
	public void in() {
		super.in();
		System.out.print(", " + "Tuoi tho: " + ttho + ", " + "Chau luc: ");
		switch(chluc) {
			case 'A':
				System.out.print("A");
				break;
			case 'W':
				System.out.print("Au");
				break;
			case 'M':
				System.out.print("My");
				break;
			case 'U':
				System.out.print("Uc");
				break;
			case 'P':
				System.out.print("Phi");
				break;
		}
		System.out.print(", " + "Dien tich: " + dtich);
	}
	
	public String toString() {
		String s = new String();
		s += super.toString() + ", " + "Tuoi tho: " + ttho + ", " + "Chau luc: ";
		switch(chluc) {
		case 'A':
			s += "A";
			break;
		case 'W':
			s += "Au";
			break;
		case 'M':
			s += "My";
			break;
		case 'U':
			s += "Uc";
			break;
		case 'P':
			s += "Phi";
			break;
		}
		s += ", " + "Dien tich: " + dtich;
		return s;
	}
	
	public char getChauLuc() {
		return chluc;
	}
	
	public float getGDP() {
		return super.getGDP();
	}
	
	public String getTenQG() {
		return super.getTenQG();
	}
	
	public static void main(String[] args) {
		QuocGia ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so quoc gia: ");
		int n = sc.nextInt();
		ds = new QuocGia[n];
		int choice;
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap quoc gia thu " + (i+1) + "[0(QuocGia), 1(QuocGiaPT)]: ");
			choice = sc.nextInt();
			if(choice == 0)
				ds[i] = new QuocGia();
			else
				ds[i] = new QuocGiaPT();
			ds[i].nhap();
		}
		
		System.out.println("Danh sach quoc gia vua nhap:");
		for(int i = 0; i < n; i++)
			System.out.println(ds[i]);
		
		System.out.println("Ten quoc gia co GDP tren 500 va den tu chau Phi: ");
		boolean found = false;
		for(int i = 0; i < n; i++)
			if(ds[i].getGDP() > 500 && ds[i].getChauLuc() == 'P') {
				found = true;
				System.out.println(ds[i].getTenQG());
			}
		if(!found)
			System.out.println("Khong tim duoc quoc gia phu hop tu danh sach");
		
		HashMap <Character, Float> TKCL = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(ds[i].getChauLuc() != 'X') {
				float tongGDP = TKCL.getOrDefault(ds[i].getChauLuc(), 0.0f);
				TKCL.put(ds[i].getChauLuc(), tongGDP + ds[i].getGDP());
			}
		}
		
		System.out.println("GDP trung binh cua cac nuoc phat trien theo tung chau luc: ");
		System.out.println("|----------|----------------|");
		System.out.println("| Chau luc | GDP trung binh |");
		System.out.println("|----------|----------------|");
		for(Character chau_luc : TKCL.keySet()) {
			float tongGDP = TKCL.get(chau_luc);
			int so_qg = 0;
			for(int i = 0; i < n; i++)
				if(ds[i].getChauLuc() == chau_luc)
					so_qg++;
			System.out.printf("|%c         |%-16.2f|\n", chau_luc, (float) tongGDP/so_qg);
		}
		System.out.println("|----------|----------------|");
	
	}
}

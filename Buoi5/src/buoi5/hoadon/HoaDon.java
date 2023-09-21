package buoi5.hoadon;
import java.util.Scanner;
public class HoaDon {
	private String maso, tieude;
	private Date ngaylap;
	private KhachHang kh;
	private ChiTiet ct[];
	
	public HoaDon(){
		maso = new String();
		tieude = new String();
		ngaylap = new Date();
		kh = new KhachHang();
		ct = new ChiTiet[50];
	}
	
	public HoaDon(HoaDon h){
		maso = new String(h.maso);
		tieude = new String(h.tieude);
		ngaylap = new Date(h.ngaylap);
		kh = new KhachHang(h.kh);
		ct = new ChiTiet[50];
		for(int i = 0; i < ct.length; i++){
			if(ct[i] == null)
				break;
			ct[i] = new ChiTiet(h.ct[i]);
		}
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hoa don: ");
		maso = sc.nextLine();
		System.out.print("Nhap tieu de hoa don: ");
		tieude = sc.nextLine();
		System.out.println("Nhap ngay lap hoa don: ");
		ngaylap.nhap();
		System.out.print("Nhap loai khach hang [Thuong (0), VIP (1)]: ");
		int choice = sc.nextInt();
		if(choice == 1)
			kh = new KhachHangVIP();
		kh.nhap();
		System.out.print("Nhap so chi tiet: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			System.out.println("--Nhap chi tiet thu " + (i+1) + "--");
			ct[i] = new ChiTiet();
			ct[i].nhap();
		}
	}
	public void in(){
		System.out.println("==HOA DON==");
		System.out.println("Ma so HD: " + maso + "\nTieu de: " + tieude + "\nNgay lap: " + ngaylap);
		System.out.println("Thong tin khach hang: " +  "[" + kh + "]");
		System.out.println("Chi tiet hoa don:");
		for(int i = 0; i < ct.length; i++){
			if(ct[i] == null)
				break;
			System.out.println(ct[i]);
		}
		System.out.println("Tong so tien (10% VAT): " + tongtien());
	}
	
	public String toString(){
		String s = new String();
		s += "==HOA DON==\n" + "Ma so HD: " + maso + "\nTieu de: " + tieude + "\nNgay lap: " + ngaylap;
	    s += "\nThong tin khach hang:" + "[" + kh + "]" + "\nChi tiet hoa don:\n";
	    for(int i = 0; i < ct.length; i++){
	    	if(ct[i] == null)
	    		break;
	    	s += ct[i] + "\n";
	    }
	    s += "Tong so tien (10% VAT): " + tongtien();	
	    return s;
	}
	
	public long tongtien(){
		long sum = 0;
		for(int i = 0; i < ct.length; i++){
			if(ct[i] == null)
				break;
			sum += ct[i].thanhtien();
		}
		return (long) (1.1*sum*(1-kh.layTiLeGiam()));
	}
	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		hd.nhap();
		System.out.print(hd);
	}
}

package Test;

import java.util.Scanner;

import ThuVien.Bao;
import ThuVien.Book;
import ThuVien.QuanLyThuVien;
import ThuVien.TaiLieu;
import ThuVien.TapChi;

public class Main {

	private static int sobanphatbanh2;
	private static int sobanphathanh1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		QuanLyThuVien quanLyThuVien=new  QuanLyThuVien();
		boolean flag=true;
		int luachon;
		String nhap;
		do{
System.out.println("----------menu-----------");
System.out.println(" nhap vào lưa chon cua ban");
System.out.println("1. them tai lieu");
System.out.println("2. tim tai lieu ");
System.out.println("3. in danh sach tai lieu ");
System.out.println("4. xoa tai liệu");
System.out.println(" nhan phim bat ki de thoat");
luachon =sc.nextInt();sc.nextLine();
switch (luachon) {
case 1:{
	System.out.println(" chon loai tap chi ban muon nhap thong tin ");
	System.out.println("sach. nhap thong tin cho sach ");
	System.out.println("tc. nhap thong tin cho tap chi ");
	System.out.println("bao. nhap thong tin cho bao ");
	nhap=sc.nextLine();
	switch (nhap) {
	case "sach":{
		System.out.println(" nhap id sach");String id=sc.nextLine();
		System.out.println(" nhap  ten nha xuat ban ");String tennxb=sc.nextLine();
		System.out.println(" nhap so phat hanh "); int sopbanhathanh=sc.nextInt();sc.nextLine();
		
		System.out.println(" nhap ten tac gia ");String tentacgia=sc.nextLine();
		System.out.println(" nhap so trang ");int sotrang=sc.nextInt();sc.nextLine();
		
		TaiLieu Sach=new Book(id, tennxb, sopbanhathanh, tentacgia, sotrang);
		quanLyThuVien.ThemTaiLieu(Sach);
		
		
		
		break;
	
	}
	case"tc":{
		System.out.println(" nhap id tap chi ");String id2=sc.nextLine();
		System.out.println(" nhap ten nha xuat ban ");String tennxb2=sc.nextLine();
		System.out.println(" nhap so ban phat hanh ");int sobanphathanh1=sc.nextInt();
		System.out.println(" nhap so  phat hanh ");int sophathanh=sc.nextInt();
		System.out.println(" thang phat hanh ");int thangphathanh=sc.nextInt();sc.nextLine();
		
		TaiLieu Tapchi=new TapChi(id2, tennxb2,sobanphathanh1, sophathanh, thangphathanh);
		quanLyThuVien.ThemTaiLieu(Tapchi);
		
		break;
	}
	case"bao":{
		System.out.println(" nhap id bao ");String id3=sc.nextLine();
		System.out.println(" nhap ten nhà xuat ban");String tennxb3=sc.nextLine();
		System.out.println(" nhap so ban phat hanh ");int sobanphathan2=sc.nextInt();
		System.out.println(" nhap ngay phat hanh");int ngayphathanh=sc.nextInt();
		TaiLieu bao=new Bao(id3, tennxb3, sobanphathan2, ngayphathanh);
		quanLyThuVien.ThemTaiLieu(bao);
		break;
	}
	default:
		System.out.println(" invalid");
		break;
	}
}
	
	break;
case 2:{
	System.out.println(" nhap id tai lieu ban muon tim kiem ");
	String keyid=sc.nextLine();
	System.out.println(" kết quả tìm kiếm");
	quanLyThuVien.timTaiLieuTheoid(keyid);
	break;
}
case 3:{
	quanLyThuVien.InDanhSachTaiLieu();
	break;
	
}
case 4:{
	
	System.out.println(" nhap id tai lieu ban muon xoa");
	String key=sc.nextLine();
	TaiLieu taiLieu=new TaiLieu(key);
	quanLyThuVien.xoatailieu(taiLieu);
	System.out.println(" đã xoa");

}
default:
	break;
}
		}while(flag);

	}

}

package test;

import java.util.Scanner;

import main.DanhSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		DanhSinhVien danhSinhVien = new DanhSinhVien();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int luachon;
		do {
			System.out.println(" menu");
			System.out.println("lựa chon của ban ");
			System.out
					.println("+1thêm sinh viên vào danh sach\n"
							+"+2 in danh sach sinh vien ra mna hinh\n"
							+"+3 kiem tra danh sach co rong hay khong\n"
							+"+4 cho biet danh sach co bao nhieu sinh vienn\n"
							+"+5 xoa toan bo danh sach\n"
							+"+6 kiem tra ngau sinh vien co tôn tai trong danh sach hay khong ,key= ma so sinh vien\n"
							+"+7 xoa mot sinh vien ra khoi danh sach dua vao ma sinh  vien \n"
							+"+8 tim kiem tat ca sinh vien theo ten nhap tu ban phim\n"
							+"+9 xuat ra cac sinh vien co diem tu cao den thap\n"
							+"+ nhap phim khac bat ky de thoat chuong trinh");
			luachon = sc.nextInt();
			sc.nextLine();
			switch (luachon) {
			// thêm sinh vien vao danh sach
			case 1:
				System.out.println(" nhap ma so sinh vien: ");
				String maSV = sc.nextLine();
				System.out.println(" nhap ho ten sinh vien: ");
				String hotenSinhvien = sc.nextLine();
				System.out.println(" nhap nam sinh sinh vien: ");
				int nam = sc.nextInt();
				System.out.println(" diem trung binh: ");
				float diemtb = sc.nextFloat();
				SinhVien sv = new SinhVien(hotenSinhvien, maSV, nam, diemtb);
				danhSinhVien.themSV(sv);

				break;
			case 2:
				// in sach sach sinh vien
				danhSinhVien.InDanhSachSinhVien();
				break;
			// kiem tra danh sach co rong hay khong
			case 3:
				System.out.println(" danh sach rong "
						+ danhSinhVien.kiemtrarong());
				break;
			case 4:
				// lay so luong sinh vien trong danh sach
				System.out.println(" so luong sinh vien trong danh sach "
						+ danhSinhVien.getsoluongsinhvien());
				break;
			case 5:
				// lam rong danh sach
				danhSinhVien.lamrongdanhsach();
				System.out.println(" danh sach sau khi lam rong");
				danhSinhVien.InDanhSachSinhVien();

				break;
			case 6:
				// kiem tra sinh vien co ton tai trong danh sach khong su dung
				// ma sinh vien
				String maSinhvien;
				System.out.println(" nhap ma sinh vien ban muon tim");
				maSinhvien = sc.nextLine();
				SinhVien svVien = new SinhVien(maSinhvien);
				System.out.println(" sinh vien ton tai "
						+ danhSinhVien.kiemtrasinhvientontai(svVien));
				break;
			case 7:
				String masv2;
				System.out.println(" nhap ma sinh vien ban muon xoa: ");
				masv2 = sc.nextLine();
				SinhVien sinhVien = new SinhVien(masv2);
				danhSinhVien.xoasinhvien(sinhVien);
				System.out.println(" đã xóa");
				break;
			case 8:
				// tim tat ca sinh vien theo ten
				String hovaten;
				System.out.println(" nhap ho ten sinh vien ban muon tim kiem ");
				hovaten = sc.nextLine();
				System.out.println(" ket qua sau khi tim kiem");
				danhSinhVien.timsinhvientheoten(hovaten);
				break;
			case 9:
				// in ra sinh vien diem tang dan tu cao den thap
				danhSinhVien.sapxepsinhviengiamdantheodiem();
				danhSinhVien.InDanhSachSinhVien();
				break;
			default:
				break;
			}

		} while (flag);

	}

}

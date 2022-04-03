package w1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien();
		// nhâp thông tin sinh viên 1

		System.out.println(" nhập mã sinh viên 1: ");
		sv1.setMaSV(sc.nextInt());sc.nextLine();
		System.out.println(" nhập tên sinh viên 1: ");
		sv1.setTenSV(sc.nextLine());
		System.out.println(" nhập điểm lý thuyết: ");
		sv1.setDiemLT(sc.nextFloat());
		System.out.println(" nhập điêm thực hành: ");
		sv1.setDiemTH(sc.nextFloat());
		
		
		System.out.println("-----------------");

		// nhâp thông tin sinh viên 2
		SinhVien sv2 = new SinhVien();
		System.out.println(" nhập mã sinh viên 2 ");
		sv2.setMaSV(sc.nextInt());sc.nextLine();
		System.out.println(" nhập tên sinh viên 2: ");
		sv2.setTenSV(sc.nextLine());
		System.out.println(" nhập điểm lý thuyết: ");
		sv2.setDiemLT(sc.nextFloat());
		System.out.println(" nhập điêm thực hành: ");
		sv2.setDiemTH(sc.nextFloat());
		
		System.out.println("-----------------");
		// nhâp thông tin sinh viên 3
		SinhVien sv3 = new SinhVien();
		System.out.println(" nhập mã sinh viên 3 ");
		sv3.setMaSV(sc.nextInt());sc.nextLine();
		System.out.println(" nhập tên sinh viên 3: ");
		sv3.setTenSV(sc.nextLine());
		System.out.println(" nhập điểm lý thuyết: ");
		sv3.setDiemLT(sc.nextFloat());
		System.out.println(" nhập điêm thực hành: ");
		sv3.setDiemTH(sc.nextFloat());
		
		
		System.out.printf("%6s %10s %15s %10s %10s\n"," Mã Sv"," Tên SV","Điểm LT","Điểm TH","Điểm TB" );
	// xuất thông tin sinh viên
		sv1.InThongTinSinhVien();
		sv2.InThongTinSinhVien();
		sv2.InThongTinSinhVien();
	}
}

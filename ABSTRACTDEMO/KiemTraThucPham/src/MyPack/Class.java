package MyPack;

import java.util.Scanner;

public class Class {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ThucPham thucPham=new ThucPham();
	boolean k=true,t=true;
	System.out.println(" Nhâp mã hàng");
thucPham.setMaHang(sc.nextInt());
sc.nextLine();
do{
	System.out.println(" nhập tên hàng: ");
	thucPham.setTenHang(sc.nextLine());
	
}while(thucPham.KiemTraHang(k));
System.out.println("nhập đơn giá: ");
thucPham.setDonGia(sc.nextDouble());
do{
	System.out.println(" nhập năm tháng ngày sản xuất: ");
	thucPham.SetNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
	System.out.println(" nhập năm tháng ngày hết hạn");
	thucPham.SetHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
}while (thucPham.KiemTraThoiGianSuDung(t));
System.out.println(thucPham);
thucPham.KiemTraHanSuDung();
}
}

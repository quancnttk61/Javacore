public class Test {
	public static void main(String[] args) {
		HangSX hangSX = new HangSX("LamboGiNi", "Đức");
		HangSX hangSX2 = new HangSX("VietNamAIRFLY", "VietNam");
		HangSX hangSX3 = new HangSX("Hitachi", "Nhat Ban");
		PhuongTienDicChuyen phuongTienDicChuyen = new MayBay(hangSX2,
				"may bay van vien quoc te");
		PhuongTienDicChuyen phuongTienDicChuyen2 = new OTO(hangSX,
				"sieu xe the thao");
		PhuongTienDicChuyen phuongTienDicChuyen3 = new XeCoGioi(hangSX3,
				"xe Can cuoc ");
		System.out.println(" ten hang san xuat cua phuong tien thu nhat la: "
				+ phuongTienDicChuyen.LayTenHangSanXuat());
		System.out.println(" ten hang san xuat của phuong tien thu 2 la: "
				+ phuongTienDicChuyen2.LayTenHangSanXuat());
		System.out.println("te nhang san xuat của phuong tien thư 3 là: "+phuongTienDicChuyen3.LayTenHangSanXuat());
	System.out.println("ten phong tien 1: "+ phuongTienDicChuyen.getTenLoaiPhuongTien()+" /van toc trung binh kho luu thong: "+phuongTienDicChuyen.VanTocTungBinh());
System.out.println("ten phuong tien 2: "+phuongTienDicChuyen2.getTenLoaiPhuongTien()+" /van toc trung binh khi luu thong: "+phuongTienDicChuyen2.VanTocTungBinh());
System.out.println(" ten phuong tien 3: "+phuongTienDicChuyen3.getTenLoaiPhuongTien()+" /van toc trung bình khi luu thong: "+phuongTienDicChuyen3.VanTocTungBinh());	}
}

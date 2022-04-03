
public class Test {

	public static void main(String[] args) {
		Ngay day1=new Ngay(20, 1, 2002);
		TACGIA tacgia=new TACGIA("minh quan", day1);
		SACH sach=new SACH("cuoc phieu luu",700000, tacgia, 2020);
		Ngay day2=new Ngay(27, 5, 2000);
		TACGIA tacgia2=new TACGIA("Kim Ngan", day2);
		SACH sach2=new  SACH("nhung nguoi cung kho", 50000, tacgia2, 2002);
		sach.InTenSach();
		sach2.InTenSach();
	System.out.println("cung nam xuat ban: "+ sach.KiemTraCungNamXuatBan(sach2));
System.out.println("gia sach 1 sau khi giam: "+ sach.GiaSauKhiGiam(20));
System.out.println("gia sach 2 sau khi giam: "+ sach2.GiaSauKhiGiam(15));
	}

}

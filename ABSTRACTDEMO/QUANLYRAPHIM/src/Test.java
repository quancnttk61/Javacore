
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NGAYCONGCHIEU ngay1=new NGAYCONGCHIEU(6, 5, 2020) ;
		NGAYCONGCHIEU ngay2=new NGAYCONGCHIEU(20, 12, 2022);
		NHASX nhasx1=new NHASX("Kim Dung", "Trung Quoc");
		NHASX nhasx2=new NHASX("marvel", "USA");
		PHIM phim1=new PHIM("Thien Long Bat Bo",nhasx1 , 2011,120000, ngay1);
		PHIM phim2=new PHIM("spider man", nhasx2, 2005, 3800000, ngay2);
	 System.out.println("gia ve phim 1 re hon phim 2: "+ phim1.KiemTraReHon(phim2));
	 	 System.out.println("gia phim sau khi giam gia 18%: "+ phim2.GiaSauKhiKhuyenMai(18));
	 	 System.out.println("ten hang san xuat: "+ phim1.InTenHangSX());
	 	 System.out.println("gia phim sau khi giam gia 10%: "+ phim1.GiaSauKhiKhuyenMai(10));
	 	 System.out.println("ten hang san xuat: "+ phim2.InTenHangSX());



	}

}

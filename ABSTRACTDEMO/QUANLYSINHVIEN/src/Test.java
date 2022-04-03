
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NGAY day1=new NGAY(20, 2, 2002);
		NGAY day2=new NGAY(20, 1, 2001);
		LOP lop =new LOP("CNTTk61", "CNTT");
		LOP lop2=new LOP("QTKD ","KINH TE");
		SINHVIEN sinhvien=new SINHVIEN("6150171087", "Nguyen Minh Quan", lop, 9.0,day1);
		SINHVIEN sinhvien2=new SINHVIEN("6151081076", "Bui Qui Thai", lop2, 9.0, day2);
		System.out.println(" sinh vien 1 hoc khoa : " + sinhvien.InTenKhoa());
		System.out.println(" pass :"+ sinhvien.KiemTraDau());
		System.out.println("sinh vien 2 hoc khoa :"+ sinhvien2.InTenKhoa());
		System.out.println("pass :"+ sinhvien2.KiemTraDau());
		System.out.println("kiem tra sinh vien 1 va 2 trung ngay sinh: " +sinhvien.KiemTraTrungNgaySinh(sinhvien2));
		
		
	}

}

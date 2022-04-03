import java.math.BigDecimal;
public class PHIM {
	private String TenPhim;
	private NHASX NhaSX;
	private int NamSX;
	private double GiaVe;
	private NGAYCONGCHIEU NgayChieu;
	public PHIM(String tenPhim, NHASX nhaSX, int namSX, double giaVe,
			NGAYCONGCHIEU ngayChieu) {
		super();
		TenPhim = tenPhim;
		NhaSX = nhaSX;
		NamSX = namSX;
		GiaVe = giaVe;
		NgayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return TenPhim;
	}
	public void setTenPhim(String tenPhim) {
		TenPhim = tenPhim;
	}
	public NHASX getNhaSX() {
		return NhaSX;
	}
	public void setNhaSX(NHASX nhaSX) {
		NhaSX = nhaSX;
	}
	public int getNamSX() {
		return NamSX;
	}
	public void setNamSX(int namSX) {
		NamSX = namSX;
	}
	public double getGiaVe() {
		return GiaVe;
	}
	public void setGiaVe(double giaVe) {
		GiaVe = giaVe;
	}
	public NGAYCONGCHIEU getNgayChieu() {
		return NgayChieu;
	}
	public void setNgayChieu(NGAYCONGCHIEU ngayChieu) {
		NgayChieu = ngayChieu;
	}
public boolean KiemTraReHon(PHIM other){
return this.GiaVe<other.GiaVe;
}
public String InTenHangSX(){
	return this.NhaSX.getTenNhaSanXuat(); 
	}

public double GiaSauKhiKhuyenMai(double x){
	return Math.round(this.GiaVe*(1-x/100));

	}
}

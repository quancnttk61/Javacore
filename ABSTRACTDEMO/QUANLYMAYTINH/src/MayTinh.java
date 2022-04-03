
public class MayTinh {
public HangSX getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}
	public Ngay getNgay() {
		return ngay;
	}
	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	public double getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}
	public int getThoiGianBaoHanh() {
		return ThoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		ThoiGianBaoHanh = thoiGianBaoHanh;
	}
private HangSX hangSX;
private Ngay ngay;
private double GiaBan;
private int ThoiGianBaoHanh;// tính theo thang
public MayTinh(HangSX hangSX, Ngay ngay, double giaBan, int thoiGianBaoHanh) {
	super();
	this.hangSX = hangSX;
	this.ngay = ngay;
	GiaBan = giaBan;
	ThoiGianBaoHanh = thoiGianBaoHanh;
}
public boolean KiemtraReHon(MayTinh other){
	return this.GiaBan<other.GiaBan;
}
public String TraTenQuocGia(){
	return this.hangSX.getQuocgia().getTenQuocGia();
}
}

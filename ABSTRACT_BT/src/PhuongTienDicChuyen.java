
public abstract class PhuongTienDicChuyen {
	public PhuongTienDicChuyen(HangSX hangSX, String tenLoaiPhuongTien) {
		super();
		this.hangSX = hangSX;
		TenLoaiPhuongTien = tenLoaiPhuongTien;
	}
	protected HangSX hangSX;
	protected String TenLoaiPhuongTien;
public String getTenLoaiPhuongTien() {
		return TenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		TenLoaiPhuongTien = tenLoaiPhuongTien;
	}


	public abstract String LayTenHangSanXuat();
public abstract int VanTocTungBinh();
	


}

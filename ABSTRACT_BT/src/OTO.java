
public class OTO extends PhuongTienDicChuyen{
	public OTO(HangSX hangSX, String tenLoaiPhuongTien) {
		super(hangSX, tenLoaiPhuongTien);
		// TODO Auto-generated constructor stub
	}

	private String SoLuongChoNgoi;



	public String getSoLuongChoNgoi() {
		return SoLuongChoNgoi;
	}

	public void setSoLuongChoNgoi(String soLuongChoNgoi) {
		SoLuongChoNgoi = soLuongChoNgoi;
	}

	@Override
	public String LayTenHangSanXuat() {
		// TODO Auto-generated method stub
		return this.hangSX.getHangSX();
	}

	@Override
	public int VanTocTungBinh() {
		// TODO Auto-generated method stub
		return 60;
	}
	

}

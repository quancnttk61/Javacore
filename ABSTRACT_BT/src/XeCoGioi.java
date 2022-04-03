
public class XeCoGioi extends PhuongTienDicChuyen {

	public XeCoGioi(HangSX hangSX, String tenLoaiPhuongTien) {
		super(hangSX, tenLoaiPhuongTien);
		// TODO Auto-generated constructor stub
	}

	private String ChucNang;

	public String getChucNang() {
		return ChucNang;
	}

	public void setChucNang(String chucNang) {
		ChucNang = chucNang;
	}

	@Override
	public String LayTenHangSanXuat() {
		// TODO Auto-generated method stub
		return this.hangSX.getHangSX();
	}

	@Override
	public int VanTocTungBinh() {
		// TODO Auto-generated method stub
		return 5;
	}

}

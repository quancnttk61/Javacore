
public class MayBay extends PhuongTienDicChuyen{
	public MayBay(HangSX hangSX, String tenLoaiPhuongTien) {
		super(hangSX, "Máy Bay");
		// TODO Auto-generated constructor stub
	}

	private String TenloaiNhienLieu;

	@Override
	public String LayTenHangSanXuat() {
		// TODO Auto-generated method stub
		return this.hangSX.getHangSX();
	}

	@Override
	public int VanTocTungBinh() {
		// TODO Auto-generated method stub
		return 300;
	}



}

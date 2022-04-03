package TuyenSinh;

public class ThiSinhKhoiA extends ThiSinh{
	public ThiSinhKhoiA(int sobaodanh,String hoten, String diachi, int mucuutien,float toan,float ly,float hoa) {
		super(hoten, diachi, mucuutien, sobaodanh);
		this.toan=toan;
		this.ly=ly;
		this.hoa=hoa;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThiSinhKhoiA [toan=" + toan + ", ly=" + ly + ", hoa=" + hoa
				+ ", hoten=" + hoten + ", diachi=" + diachi + ", mucuutien="
				+ mucuutien + "]";
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	private float toan;
	private float ly;
	private float hoa;

}

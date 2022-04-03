package TuyenSinh;

public class ThiSinhKhoiB extends ThiSinh{
	public ThiSinhKhoiB(int sobaodanh, String hoten, String diachi, int mucuutien,float toan,float sinh,float hoa) {
		super(hoten, diachi, mucuutien, sobaodanh);
		this.toan=toan;
		this.hoa=hoa;
		this.sinh=sinh;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThiSinhKhoiB [toan=" + toan + ", sinh=" + sinh + ", hoa=" + hoa
				+ ", hoten=" + hoten + ", diachi=" + diachi + ", mucuutien="
				+ mucuutien + "]";
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getSinh() {
		return sinh;
	}
	public void setSinh(float sinh) {
		this.sinh = sinh;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	private float toan;
	private float sinh;
	private float hoa;
	

}

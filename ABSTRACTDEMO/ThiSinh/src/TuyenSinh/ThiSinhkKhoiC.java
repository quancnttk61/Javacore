package TuyenSinh;

public class ThiSinhkKhoiC  extends ThiSinh{
	public ThiSinhkKhoiC(int sobaodanh,String hoten, String diachi, int mucuutien,float van,float su,float dia) {
		super(hoten, diachi, mucuutien, sobaodanh);
		// TODO Auto-generated constructor stub
		this.van=van;
		this.su=su;
		this.dia=dia;
	}
	@Override
	public String toString() {
		return "ThiSinhkKhoiC [van=" + van + ", su=" + su + ", dia=" + dia
				+ ", hoten=" + hoten + ", diachi=" + diachi + ", mucuutien="
				+ mucuutien + "]";
	}
	public float getVan() {
		return van;
	}
	public void setVan(float van) {
		this.van = van;
	}
	public float getSu() {
		return su;
	}
	public void setSu(float su) {
		this.su = su;
	}
	public float getDia() {
		return dia;
	}
	public void setDia(float dia) {
		this.dia = dia;
	}
	private float van;
	private float su;
	private float dia;

}

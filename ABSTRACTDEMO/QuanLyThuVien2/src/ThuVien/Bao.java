package ThuVien;

public class Bao extends TaiLieu{
	public Bao(String id, String tenNXB, int sobanphatbanh,int ngayphathanh) {
		
		super(id, tenNXB, sobanphatbanh);
		// TODO Auto-generated constructor stub
this.ngayphathanh=ngayphathanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayphathanh=" + ngayphathanh + ", id=" + id + ", TenNXB="
				+ TenNXB + ", sobanphatbanh=" + sobanphatbanh + "]";
	}

	public int getNgayphathanh() {
		return ngayphathanh;
	}

	public void setNgayphathanh(int ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}

	private int ngayphathanh;
	

}

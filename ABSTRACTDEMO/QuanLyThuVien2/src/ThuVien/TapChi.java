package ThuVien;

public class TapChi extends TaiLieu{
public TapChi(String id, String tenNXB, int sobanphatbanh,int sophathanh,int thangphathanh) {
	
		super(id, tenNXB, sobanphatbanh);
		// TODO Auto-generated constructor stub
		this.sophathanh=sobanphatbanh;
		this.thangphathanh=thangphathanh;
	}
@Override
public String toString() {
	return "TapChi [sophathanh=" + sophathanh + ", thangphathanh="
			+ thangphathanh + ", id=" + id + ", TenNXB=" + TenNXB
			+ ", sobanphatbanh=" + sobanphatbanh + "]";
}
public int getSophathanh() {
	return sophathanh;
}
public void setSophathanh(int sophathanh) {
	this.sophathanh = sophathanh;
}
public int getThangphathanh() {
	return thangphathanh;
}
public void setThangphathanh(int thangphathanh) {
	this.thangphathanh = thangphathanh;
}
private int sophathanh;
private int thangphathanh;

}

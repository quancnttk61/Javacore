
public class SINHVIEN {
	private String MSSV,HovaTen;
	private  LOP lop;
	private float Diem;
	private NGAY NgaySinh;
	public SINHVIEN(String mSSV, String hovaTen, LOP lop, double Diem, NGAY ngaySinh) {
		super();
		MSSV = mSSV;
		HovaTen = hovaTen;
		this.lop = lop;
		Diem = Diem;
		NgaySinh = ngaySinh;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getHovaTen() {
		return HovaTen;
	}
	public void setHovaTen(String hovaTen) {
		HovaTen = hovaTen;
	}
	public LOP getLop() {
		return lop;
	}
	public void setLop(LOP lop) {
		this.lop = lop;
	}
	public float getDiem() {
		return Diem;
	}
	public void setDiem(float diem) {
		Diem = diem;
	}
public String InTenKhoa(){
	return this.lop.getTenKhoa();
	
	}

public boolean KiemTraDau(){
	return this.Diem>5.0;
}
public boolean KiemTraTrungNgaySinh(SINHVIEN other){
	return this.NgaySinh==other.NgaySinh;

}
public NGAY getNgaySinh() {
	return NgaySinh;
}
public void setNgaySinh(NGAY ngaySinh) {
	NgaySinh = ngaySinh;
}
}

package w1;

public class SinhVien {
private int maSV;

private String tenSV;
private float diemLT,diemTH;
public SinhVien() {
}
public int getMaSV() {
	return maSV;
}
public void setMaSV(int maSV) {
	this.maSV = maSV;
}
public String getTenSV() {
	return tenSV;
}
public void setTenSV(String tenSV) {
	this.tenSV = tenSV;
}
public float getDiemLT() {
	return diemLT;
}
public void setDiemLT(float diemLT) {
	this.diemLT = diemLT;
}
public float getDiemTH() {
	return diemTH;
}
public void setDiemTH(float diemTH) {
	this.diemTH = diemTH;
}
public SinhVien(int maSV, String tenSV, float diemLT, float diemTH) {
	super();
	this.maSV = maSV;
	this.tenSV = tenSV;
	this.diemLT = diemLT;
	this.diemTH = diemTH;
}
public float TinhDiemTb(){
	return (this.diemLT+this.diemTH)/2;
}
public  void InThongTinSinhVien(){
	System.out.printf("%-6d %10s %12.2f %12.2f %12.2f\n",maSV,tenSV,diemLT,diemTH,TinhDiemTb() );
}

}


public class SACH {
private String TenSach;
private double GiaBan;
private TACGIA tacgia;
private int namXB;
public String getTenSach() {
	return TenSach;
}
public void setTenSach(String tenSach) {
	TenSach = tenSach;
}
public double getGiaBan() {
	return GiaBan;
}
public void setGiaBan(double giaBan) {
	GiaBan = giaBan;
}
public TACGIA getTacgia() {
	return tacgia;
}
public void setTacgia(TACGIA tacgia) {
	this.tacgia = tacgia;
}
public int getNamXB() {
	return namXB;
}
public void setNamXB(int namXB) {
	this.namXB = namXB;
}
public SACH(String tenSach, double giaBan, TACGIA tacgia, int namXB) {
	super();
	TenSach = tenSach;
	GiaBan = giaBan;
	this.tacgia = tacgia;
	this.namXB = namXB;
}
public void InTenSach(){
	System.out.println("ten sach la: "+ this.TenSach);
}
public boolean KiemTraCungNamXuatBan(SACH sachkhac){

return this.namXB==sachkhac.namXB;
}
public double GiaSauKhiGiam(double x){
	return this.GiaBan*(1-x/100);
}
}

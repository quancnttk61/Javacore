package main;

public class SinhVien implements Comparable<SinhVien>{
@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", maSV=" + maSV + ", namSinh="
				+ namSinh + ", Diemtb=" + Diemtb + "]";
	}
private String hoTen,maSV;
private int namSinh;
private float Diemtb;
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getMaSV() {
	return maSV;
}
public void setMaSV(String maSV) {
	this.maSV = maSV;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public float getDiemtb() {
	return Diemtb;
}
public void setDiemtb(float diemtb) {
	Diemtb = diemtb;
}
public SinhVien(String hoTen, String maSV, int namSinh, float diemtb) {
	
	this.hoTen = hoTen;
	this.maSV = maSV;
	this.namSinh = namSinh;
	Diemtb = diemtb;
}
@Override
public int compareTo(SinhVien sv) {
	return this.maSV.compareTo(sv.maSV);

}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(Diemtb);
	result = prime * result + ((hoTen == null) ? 0 : hoTen.hashCode());
	result = prime * result + ((maSV == null) ? 0 : maSV.hashCode());
	result = prime * result + namSinh;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SinhVien other = (SinhVien) obj;
	
	if (maSV == null) {
		if (other.maSV != null)
			return false;
	} else if (!maSV.equals(other.maSV))
		return false;

	return true;
}
public SinhVien(String msv){
	this.maSV=msv;
}
}

package TuyenSinh;

import java.util.Comparator;

public class ThiSinh {
public int getSobaodanh() {
		return sobaodanh;
	}
	public void setSobaodanh(int sobaodanh) {
		this.sobaodanh = sobaodanh;
	}
	public int getMucuutien() {
		return mucuutien;
	}
	public void setMucuutien(int mucuutien) {
		this.mucuutien = mucuutien;
	}
protected String hoten;
protected String diachi;
protected int sobaodanh;
protected int mucuutien;
public ThiSinh(String hoten, String diachi, int mucuutien,int sobaodanh) {
	this.sobaodanh=sobaodanh;
	this.hoten = hoten;
	this.diachi = diachi;
	this.mucuutien = mucuutien;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + sobaodanh;
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
	ThiSinh other = (ThiSinh) obj;
	if (sobaodanh != other.sobaodanh)
		return false;
	return true;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public int getmucuutien() {
	return mucuutien;
}
public void setmucuutien(int mucuutien) {
	this.mucuutien = mucuutien;
}
@Override
public String toString() {
	return "ThiSinh [hoten=" + hoten + ", diachi=" + diachi + ", mucuutien="
			+ mucuutien + "]";
}



}



package w1;

public class vehicle {
private int bienSo;
private String chuXe,MoTa;
private double GiaTien;
private int DungTich;
public vehicle(){
	
}
public vehicle(int bienSo, String chuXe, String moTa, double giaTien,
		int dungTich) {
	this.bienSo = bienSo;
	this.chuXe = chuXe;
	MoTa = moTa;
	GiaTien = giaTien;
	DungTich = dungTich;
}
public int getBienSo() {
	return bienSo;
}
public void setBienSo(int bienSo) {
	this.bienSo = bienSo;
}
public String getChuXe() {
	return chuXe;
}
public void setChuXe(String chuXe) {
	this.chuXe = chuXe;
}
public String getMoTa() {
	return MoTa;
}
public void setMoTa(String moTa) {
	MoTa = moTa;
}
public double getGiaTien() {
	return GiaTien;
}
public void setGiaTien(double giaTien) {
	GiaTien = giaTien;
}
public int getDungTich() {
	return DungTich;
}
public void setDungTich(int dungTich) {
	DungTich = dungTich;
}
public double TinhThue(){
	double thue=0;
	if(DungTich<100){
	thue=GiaTien*0.01;
}else if(DungTich>=100&&DungTich<175){
	thue=GiaTien*0.025;
}
	return thue;
}
public void printfVehrcle(){
	System.out.printf("%6d %");
}
}
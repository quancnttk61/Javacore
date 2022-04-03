package MyPack;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ThucPham {
private int maHang;
private String tenHang;
private double donGia;
private Date nSX,hSD;
public ThucPham(){}
public ThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
	super();
	this.maHang = maHang;
	this.tenHang = tenHang;
	this.donGia = donGia;
	this.nSX = nSX;
	this.hSD = hSD;
}
public int getMaHang() {
	return maHang;
}
public void setMaHang(int maHang) {
	this.maHang = maHang;
}
public String getTenHang() {
	return tenHang;
}
public void setTenHang(String tenHang) {
	this.tenHang = tenHang;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia = donGia;
}
public Date getnSX() {
	return nSX;
}
public void setnSX(Date nSX) {
	this.nSX = nSX;
}
public Date gethSD() {
	return hSD;
}
public void sethSD(Date hSD) {
	this.hSD = hSD;
}
// to sting 
@Override
public String toString() {
	Locale lc=new Locale("vi","VN");
	NumberFormat currenVN=NumberFormat.getCurrencyInstance(lc);
			String str1 =currenVN.format(donGia);
	SimpleDateFormat formatdate= new SimpleDateFormat("dd/MM/yyyy");
	String str2 =formatdate.format(nSX);
	String str3 =formatdate.format(hSD);
	return "ThucPham \n"+"  maHang; "+this.maHang + " tenHang; " +this.tenHang + " donGia: "
			+ this.donGia + " nSX="+this.nSX + " hSD: " + this.hSD ;
}
public void SetNSX(int day,int month,int year){
	Calendar calendar =Calendar.getInstance();
	calendar.set(year,month-1,day);
	this.nSX=calendar.getTime();
	}
public void SetHSD(int day,int month,int year){
	Calendar calendar =Calendar.getInstance();
	calendar.set(year,month-1,day);
	this.hSD=calendar.getTime();
	}
// kiểm tra và thông báo tên hàng đê trống
public boolean KiemTraHang(boolean k){
	if(this.tenHang==""|| this.tenHang.isEmpty()){
		System.out.println(" tên hàng không được để trống");
	}else k=false;
	return k;
}
public boolean KiemTraThoiGianSuDung(boolean t){
	if(this.getnSX().compareTo(gethSD())<0){
		System.out.println(" hàng lỗi !!! hạn sử dụng phải là ngày lớn hơn ngày sản xuất ");
	}else t=false;
	return t;
}
public  void KiemTraHanSuDung(){
	Date today=new Date();
	today.getTime();
	SimpleDateFormat formatdate=new SimpleDateFormat("dd,MM,yyyy");
	String st=formatdate.format(today);
	if(this.gethSD().compareTo(today)<0){
		System.out.println(" Hôm nay là ngaỳ: "+st+" Hàng hóa đã hết hạn ngày: "+this.hSD);
		
	}else System.out.println(" Hôm nay lf ngày: "+st+" Vẫn còn hạn cho đến ngày: "+this.hSD);
	
}
}

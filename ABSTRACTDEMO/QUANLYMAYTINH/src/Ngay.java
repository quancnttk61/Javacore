
public class Ngay {
private int ngay, thang, nam;
// ngày tháng năm mà máy tính được bán và lắp đặt

public int getNgay() {
	return ngay;
}

public void setNgay(int ngay) {
	this.ngay = ngay;
}

public int getThang() {
	return thang;
}

public void setThang(int thang) {
	this.thang = thang;
}

public int getNam() {
	return nam;
}

public void setNam(int nam) {
	this.nam = nam;
}

public Ngay(int ngay, int thang, int nam) {
	super();
	this.ngay = ngay;
	this.thang = thang;
	this.nam = nam;
}
}

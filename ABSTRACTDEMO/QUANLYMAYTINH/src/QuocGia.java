
public class QuocGia {
private String MAQG,TenQuocGia;
// thông tin bao gồm mã quóc gia và tên quốc gia
public QuocGia(String mAQG, String tenQuocGia) {
	super();
	MAQG = mAQG;
	TenQuocGia = tenQuocGia;
}

public String getMAQG() {
	return MAQG;
}

public void setMAQG(String mAQG) {
	MAQG = mAQG;
}

public String getTenQuocGia() {
	return TenQuocGia;
}

public void setTenQuocGia(String tenQuocGia) {
	TenQuocGia = tenQuocGia;
}

}

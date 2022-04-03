package ThuVien;

public class Book extends TaiLieu{
	public Book(String id, String tenNXB, int sobanphatbanh,String tentacgia,int sotrang ) {
		
		super(id, tenNXB, sobanphatbanh);
		// TODO Auto-generated constructor stub
		this.TenTacGia=tentacgia;
		this.soTrang=sotrang;
	}
	@Override
	public String toString() {
		return "Book [TenTacGia=" + TenTacGia + ", soTrang=" + soTrang
				+ ", id=" + id + ", TenNXB=" + TenNXB + ", sobanphatbanh="
				+ sobanphatbanh + "]";
	}
	public String getTenTacGia() {
		return TenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		TenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	private String TenTacGia;
	private int soTrang;
	

}

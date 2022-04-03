package ThuVien;

public class TaiLieu implements Comparable<TaiLieu>{
	protected String id;
	protected String TenNXB;
	protected int sobanphatbanh;
	public TaiLieu(String id, String tenNXB, int sobanphatbanh) {
		
		this.id = id;
		TenNXB = tenNXB;
		this.sobanphatbanh = sobanphatbanh;
	}
	@Override
	public String toString() {
		return "TaiLieu [id=" + id + ", TenNXB=" + TenNXB + ", sobanphatbanh="
				+ sobanphatbanh + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenNXB() {
		return TenNXB;
	}
	public void setTenNXB(String tenNXB) {
		TenNXB = tenNXB;
	}
	public int getSobanphatbanh() {
		return sobanphatbanh;
	}
	public void setSobanphatbanh(int sobanphatbanh) {
		this.sobanphatbanh = sobanphatbanh;
	}
	@Override
	public int compareTo(TaiLieu other) {
		// TODO Auto-generated method stub
		return this.id.compareTo(other.id);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TaiLieu other = (TaiLieu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public TaiLieu( String tl){
		this.id=tl;
	}
}
	



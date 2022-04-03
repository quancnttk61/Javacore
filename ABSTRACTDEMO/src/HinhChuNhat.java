
public class HinhChuNhat extends Hinh{
	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}

	private int chieudai,chieurong;

	public HinhChuNhat(ToaDo toaDo, int chieudai, int chieurong) {
		super(toaDo);
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	@Override
	public double TinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieudai*this.chieurong;
	}
	

}

import java.lang.Math;
public class HinhTron extends Hinh{
private double r;
	public HinhTron(ToaDo toaDo) {
		super(toaDo);
		// TODO Auto-generated constructor stub
	}
	public double getR() {
		return r;
	}
	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double TinhDienTich() {
		// TODO Auto-generated method stub
		return Math.pow(r, 2)*3.14;
	}

}

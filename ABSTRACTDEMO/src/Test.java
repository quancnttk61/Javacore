
public class Test {
public static void main(String[] args) {
	ToaDo toaDo=new ToaDo(5, 6);
	ToaDo toaDo2=new ToaDo(5, 6);
	ToaDo toaDo3=new ToaDo(5, 6);
//	Hinh hinh=new Hinh() { =>lỗi biên dic
	Hinh hinh=new Diem(toaDo);
	Hinh hinh2=new HinhTron(toaDo2,10);
	Hinh hinh3=new HinhChuNhat(toaDo3,5,7);
	
	System.out.println("dien tich hinh tron: "+ hinh2.TinhDienTich());
	System.out.println(" dien tich hinh chu nhat: "+ hinh3.TinhDienTich());
}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ngay ngay =new Ngay(1, 12, 2021);
Ngay ngay2 =new Ngay(1, 12, 2021);
Ngay ngay3 =new Ngay(1, 12, 2021);
QuocGia quocGia =new QuocGia("USA", "United States");
QuocGia quocGia2 =new QuocGia("MC", "Mexico");
QuocGia quocGia3 =new QuocGia("CN", "China");
HangSX hangSX=new HangSX("Dell", quocGia);
HangSX hangSX2=new HangSX("Lenovo", quocGia2);
HangSX hangSX3=new HangSX("Asus", quocGia3);
MayTinh mayTinh =new MayTinh(hangSX, ngay, 20000000, 18);
MayTinh mayTinh2 =new MayTinh(hangSX2, ngay2, 18000000, 12);
MayTinh mayTinh3 =new MayTinh(hangSX3, ngay, 11000000, 6);
System.out.println(" may tinh thu 1 xuat xu tu tuoc gia: "+mayTinh.TraTenQuocGia());
System.out.println("may tinh thu 2 xuat xu tu quoc gia: "+mayTinh2.TraTenQuocGia());
System.out.println("may tinh thu 3 xuat xu tu quoc gia"+mayTinh3.TraTenQuocGia());
System.out.println("may tinh thu 1 re hon may thu 2: "+ mayTinh.KiemtraReHon(mayTinh2));
System.out.println("may tinh thu 3 re hon may tinh thu nhat: "+ mayTinh3.KiemtraReHon(mayTinh2));	}

}

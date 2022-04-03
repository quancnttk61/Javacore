package game;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * một ngươi chơi sẽ có tài khoản. ngườ chơi có quền đặt cược số tiền it hơn số tiền đang có
 * luật chơi:
 * có 3 viên xúc xắc. Mỗi viên có giá trị từ 1 đến 6
 * mỗi lần lắc xí xúc xắc sẽ cho kết quả là tổng giá trị của 3 viên xúc xắc
 * 1. nếu tổng =3 hoặc =18 cái ăn hết
 * 2. nếu tổng =4->10 là xỉu nếu người chơi đắt thì ăn ko đặt thi thua
 * 3. nếu tổng bằng 11-17 là tải người chơi đặt tài thì ăn ko thì thua
 */
public class taixiu {
	public static void main(String[] args) {
		double accountplayer=1000000;
		Scanner sc=new Scanner(System.in);
		int luachon=1;
		do{
			System.out.println(" ----------------------------mời bạn lựa chon------------------");
System.out.println("Chon (1) để tiếp tục chơi.");
System.out.println("Chọn (phím bất) kỳ để thoát.");
luachon=sc.nextInt();
if(luachon==1){
	
System.out.println("************ BẮT ĐẦY CHƠI");
Locale locale=new  Locale("vi", "VN");
NumberFormat currenVN= NumberFormat.getCurrencyInstance(locale);

System.out.println(" **** tài khoản của bạn: "+currenVN.format(accountplayer));
double datcuoc;
do{
	System.out.println(" **** bạn chỉ có thể đăt cược số tiền nhỏ hơn số tiền trong tai khoản của mình.Bạn đang có "+accountplayer);
 datcuoc=sc.nextDouble();
 
}while(datcuoc>accountplayer||datcuoc<0);
int luachontaixiu=0;

do{
	System.out.println(" **** chọn 1 <-> tài chọn 2<-> xỉu");
 luachontaixiu=sc.nextInt();
 }while(luachontaixiu!=1&&luachontaixiu!=2);
// tung xúc sắc
Random xucsac1=new Random();
Random xucsac2=new Random();
Random xucsac3=new Random();
int giatri1=xucsac1.nextInt(5)+1;
int giatri2=xucsac2.nextInt(5)+1;
int giatri3=xucsac3.nextInt(5)+1;
int tong =giatri1+giatri2+giatri3;
System.out.println(" kết  qua tung xuc săc "+giatri1+"- "+giatri2+"-"+giatri3);
if(tong ==3 ||tong==18){
	System.out.println(" *********** tổng là :"+ tong+"=> nhà cái ăn hết");
	accountplayer=accountplayer-datcuoc;
	System.out.println(" tài khoản của còn "+currenVN.format(accountplayer));
}else if(tong >=4&&tong<=10){
		System.out.println(" tổng là :"+tong+" xỉu ");
		if(luachontaixiu==2){
			accountplayer+=datcuoc;
			System.out.println(" bạn đã thắng cược");
			System.out.println(" tài khoản của bạn là :"+currenVN.format(accountplayer));
			
			
		}else {
			accountplayer-=datcuoc;
			System.out.println(" bạn đã thua cược ");
			System.out.println("tài khoản của bạn là: "+currenVN.format(accountplayer));
		}
		
		}else if(tong>=11&&tong <=17){
			System.out.println(" tổng  là: "+tong+" tài");
			if(luachontaixiu==1){
				accountplayer+=datcuoc;
				System.out.println(" bạn đã thắng cược");
				System.out.println(" tài khoản của bạn la: "+currenVN.format(accountplayer));
			}else {
				accountplayer-=datcuoc;
				System.out.println("bạn đã thua cược ");
				System.out.println(" tài khoản của bạn là: "+currenVN.format(accountplayer));
			}
		}
}

		}while(luachon==1);
		}

}

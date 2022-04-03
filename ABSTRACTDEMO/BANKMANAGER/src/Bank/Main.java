package Bank;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static void nhapTK(Account tk) {
		System.out.println(" nhap so tai khoan: ");
		tk.setSoTK(sc.nextLong());
		sc.nextLine();
		System.out.println(" nhap ten tai khoan: ");
		tk.setTenTK(sc.nextLine());
		tk.setSoDu(50);
		
	}

	public static void main(String[] args) {
	Account a[]=null;
	int luachon,n = 0;
	long e,b,c,d;
	boolean flag=true;
	do{
		System.out.println("Ban can lam gi");
		System.out.println("1. Nhap thong tin tai khoan khach hang\n"+
		"2. Xem thong tin tai khoan khach hang\n"+
		"3. Nap tiền\n"+
		"4. rut tien\n"+
		"5 . chuyen khoan\n"+
		"6. chuyen tien\n"+
		"?. nhap so khac bat ki de thoat");
		luachon=sc.nextInt();
		switch (luachon) {
		case 1:
			System.out.println(" nhap so luong khach hang ");
			n=sc.nextInt();
			a=new Account[n];
			for(int i=0;i<n;i++){
				System.out.println(" khach hang so:"+(i+1));
				
				 a[i]=new Account();
				 nhapTK(a[i]);
			}
			
			break;
		case 2:
			System.out.printf("%-10s %-20s %-20s\n ","Số TK","Tên TK","Số dư trong tai khoản");
			for(int i=0;i<n;i++){
				a[i].InTK();
			}
			break;
		case 3:
			System.out.println("Nhap so tai khoan: ");
			e=sc.nextLong();
			for(int i=0;i<n;i++){
				d=a[i].getSoTK();
				if(e==d){
					System.out.println(" ban chon tai khoan: "+d);
					a[i].napTien();
				}else {
					System.out.println(" ");
				}
				}
			
			break;
		case 4:
			System.out.println("nhap so tai khoan can rut : ");
			e=sc.nextLong();
			for(int i=0;i<n;i++){
				d=a[i].getSoTK();
				if(e==d){
					System.out.println(" ban chon tai khoan"+d);
					a[i].rutTien();
					
				}
				
			}
			break;
		case 5:
			System.out.println(" nhap so tai khoan ban muon dao han:");
			e=sc.nextLong();
			for(int i=0;i<n;i++){
				d=a[i].getSoTK();
				if(e==d){
					System.out.println("ban chon tai khoan"+d);
					a[i].daoHan();
					
				}else {
					System.out.println(" ");
					
				}
			}
			 break;
		case 6:
			double chuyen,nhan,tienchuyen;
			System.out.println("nhap so tai khoan ban muon chuyen: ");
			e=sc.nextLong();
			System.out.println(" nhap so tai khoan nhan: ");
			b=sc.nextLong();
			for(int i=0;i<n;i++){
				d=a[i].getSoTK();
				if(e==d){
				chuyen=a[i].getSoDu();
				for(int j=0;j<n;j++){
					c=a[i].getSoTK();
					if(b==c){
					nhan=a[i].getSoDu();
					System.out.println("nhap so tien muon chuyen: ");
					tienchuyen=sc.nextDouble();
					if(tienchuyen<=chuyen){
						chuyen-=tienchuyen;
						nhan+=tienchuyen;
						a[i].setSoDu((long) chuyen);
						a[j].setSoDu((long) nhan);
						System.out.println(" giao dich thanh cong!!");
						System.out.println("so tai khoan chuyen: "+d+" so du hien tai la"+a[i].getSoDu());
						System.out.println(" so tai khoan nhan: "+ c+" so du hien tai la "+a[j].getSoDu());
						
					}else{
						System.out.println(" so tien nhap khong hop le!!!");
					}
					}else{
							System.out.println(" ");
						
					} 
				}
				}else {
						System.out.println(" ");
						}
					}
					
				break;
			
			
		default:
			System.out.println(" cam on ban da su dung dich vu ^^");
			flag=false;
			break;
		}
	}while(flag);
}
}

package Bank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {

	private long SoTK;
	private String tenTK;
	private double SoDu;

	Scanner sc = new Scanner(System.in);
	public Account() {
		
	}

	

	public long getSoTK() {
		return SoTK;
	}

	public void setSoTK(long soTK) {
		SoTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoDu() {
		return SoDu;
	}

	public void setSoDu(double soDu) {
		SoDu = soDu;
	}

	public Account(long soTK, String tenTK, double soDu) {

		SoTK = soTK;
		this.tenTK = tenTK;
		SoDu = soDu;
	}

	@Override
	public String toString() {
		
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		String str1 = currencyEN.format(SoDu);
		return "Account [SoTK=" + this.SoTK + " tenTK=" + this.tenTK + " SoDu="
				+ str1 + "]";
	}

	public double napTien(){
		double nap;
		System.out.println("nhap so tien ban muon nap: ");
		nap=sc.nextDouble();
		if(nap>0){
			SoDu= SoDu+nap;
			NumberFormat currencyVN=NumberFormat.getCurrencyInstance();
			String str2=currencyVN.format(nap);
			System.out.println("thao tac thanh cong ban da nap thanh cong so tien "+str2+" vao tai khoan");
			
		}else //so ti�?n nao vao ko hơp lê
System.out.println("so tien nhap vao khong hop le");
		
		return nap;
		}
	public double rutTien(){
		int phi=3000;
		double rut;
		System.out.println(" nhap so tien ban muonn rut");
		rut=sc.nextDouble();
		// chỉ có thể rút số ti�?n nh�? hơn số dư trừ đi 30000 vnd
		if(rut<=(SoDu-300000)){
			this.SoDu= this.SoDu-(rut+phi);
			NumberFormat currencyVN=NumberFormat.getCurrencyInstance();
			String str3=currencyVN.format(rut);
			System.out.println(" ban vua rut thanh cong"+str3+"vnđ từ tai khoản");
			
		}else 
		{// số dư trong tài khoản không đủ 
		System.out.println("so dư trong tai khoan khong hop le");
		return rutTien();
		}
		return rut;
	}
	// đáo han;
	public double daoHan(){
		double laiSuat=0.035;
		NumberFormat currencyVN =NumberFormat.getCurrencyInstance();
		String str4=currencyVN.format(SoDu);
		System.out.println("ban vừa được"+str4+" từ 1 tháng đáo hạn");
	return this.SoDu;
	}
	void InTK(){
		NumberFormat currencyVN=NumberFormat.getCurrencyInstance();
		String str5=currencyVN.format(SoDu);
		System.out.printf("%-10s %-20s %-20s \n ",this.SoTK,this.tenTK,str5);
	}
}

package Test;

import java.util.Scanner;

import TuyenSinh.ThiSinh;
import TuyenSinh.TuyenSInh;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
TuyenSInh tuyenSInh=new TuyenSInh();
ThiSinh thiSinh	=new ThiSinh("a", "b", 1, 1);
tuyenSInh.themthissinh(thiSinh);
tuyenSInh.InThongTinThiSinh();
int sbd=sc.nextInt();
tuyenSInh.TimkiemThiSinh(sbd);
}

}

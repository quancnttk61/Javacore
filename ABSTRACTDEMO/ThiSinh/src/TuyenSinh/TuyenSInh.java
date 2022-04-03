package TuyenSinh;

import java.util.ArrayList;
import java.util.List;

public class TuyenSInh {
	private List<ThiSinh> danhsachthisinh;
	
	public TuyenSInh (){
		this.danhsachthisinh=new ArrayList<>();
	}
	public void themthissinh(ThiSinh ts){
		this.danhsachthisinh.add(ts);
	}
	public void InThongTinThiSinh(){
		
		for (ThiSinh thiSinh :danhsachthisinh) {
			System.out.println(thiSinh);
			
		}
	} 
public void TimkiemThiSinh( int sobaobanh){
	for (ThiSinh thiSinh : danhsachthisinh) {
		if(thiSinh.getSobaodanh()==sobaobanh){
			System.out.println(thiSinh);
		}
		
	}
}
}

package ThuVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class QuanLyThuVien {
private List<TaiLieu> danhsachtailieu;

public QuanLyThuVien() {
	
	this.danhsachtailieu =new ArrayList<>();
}
public void ThemTaiLieu(TaiLieu tl){
	 this.danhsachtailieu.add(tl);
}
public void InDanhSachTaiLieu(){
	for (TaiLieu taiLieu : danhsachtailieu) {
		System.out.println(taiLieu);
		
	}
}
public boolean xoatailieu(TaiLieu tl) {
	return this.danhsachtailieu.remove(tl);
	
}
public  void  timTaiLieuTheoid(String id){
	for (TaiLieu tLieu : danhsachtailieu) {
		if(tLieu.getId().indexOf(id)==0){
			System.out.println(tLieu);
		}
		
	}
}
public void showinfor(){
	Stream<TaiLieu> kq = 
	
	//this.danhsachtailieu.forEach(o-> o.sysout)
}
}
//	public void sapxepdanhmuctailieutangdan(){
//		Collections.sort(this.danhsachtailieu,new Comparator<TaiLieu>() {
//
//					@Override
//					public int compare(TaiLieu arg0, TaiLieu arg1) {
//						if(arg0.getId()<arg1.getId()){
//							return 1;
//						}else if(arg0.getId()>arg1.getId()){
//							return 1;
//						}else {
//							return 0;
//						}
//						
//					}
//		});
//	}
//}

 


package Srouce;

import java.util.ArrayList;
import java.util.List;

public class Town {
private List<Family>town;

public Town(){
	this.town=new ArrayList<>();
}
	public void add(Family f){
		this.town.add(f);
		
	
}
	public void  showinfor(){
	for (Family family : town) {
		System.out.println(family);
		
	}	
	}
//public void find_with_id(long id){
//	for (Family family : town) {
//		if(family.getFammily().stream())
//		
//	}
//}
	}
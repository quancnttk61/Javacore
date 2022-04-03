package Srouce;

import java.util.List;

public class Family {
public Family(List<Person> fammily, String address) {
		
		this.fammily = fammily;
		this.address = address;
	}
@Override
public String toString() {
	return "Family [fammily=" + fammily + ", address=" + address + "]";
}
public List<Person> getFammily() {
	return fammily;
}
public void setFammily(List<Person> fammily) {
	this.fammily = fammily;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private List<Person> fammily;
private  String  address;
}


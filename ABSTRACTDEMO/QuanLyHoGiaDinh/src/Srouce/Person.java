package Srouce;

public class Person {
private String name;
private int age;
private String jop;
private long id_person;
public Person(String name, int age, String jop, long id_person) {
	
	this.name = name;
	this.age = age;
	this.jop = jop;
	this.id_person = id_person;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", jop=" + jop
			+ ", id_person=" + id_person + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id_person ^ (id_person >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (id_person != other.id_person)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getJop() {
	return jop;
}
public void setJop(String jop) {
	this.jop = jop;
}
public long getId_person() {
	return id_person;
}
public void setId_person(long id_person) {
	this.id_person = id_person;
}
}

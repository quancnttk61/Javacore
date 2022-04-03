package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DanhSinhVien {

@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
private ArrayList<SinhVien> danhsach;

public DanhSinhVien(ArrayList<SinhVien> danhsach) {
	
	this.danhsach = danhsach;
}
public DanhSinhVien(){
	this.danhsach=new ArrayList<SinhVien>();
}
public  void themSV( SinhVien sv){
	this.danhsach.add(sv);
}
public void InDanhSachSinhVien(){
	for (SinhVien sinhVien : danhsach) {
		System.out.println(sinhVien);
		
	}
}
public boolean kiemtrarong(){
	return this.danhsach.isEmpty();
}
public int getsoluongsinhvien(){
	return this.danhsach.size();
}
public void lamrongdanhsach(){
	this.danhsach.removeAll(danhsach);
}
// kiểm tra sinh viên tồn tại dựa vào mã sinh viên
public boolean kiemtrasinhvientontai(SinhVien sv){
	return this.danhsach.contains(sv);
}
public boolean xoasinhvien(SinhVien sv){
	return this.danhsach.remove(sv);
}
public boolean layrasinhvien(SinhVien sv){
	return this.danhsach.contains(sv);
}
public void timsinhvientheoten( String ten){
	for (SinhVien sinhvien: danhsach) {
		if(sinhvien.getHoTen().indexOf(ten)==0){
		System.out.println(sinhvien);	
		}
		
		}
}
		public void sapxepsinhviengiamdantheodiem(){
			Collections.sort(this.danhsach,new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien sv1, SinhVien sv2) {
					// TODO Auto-generated method stub
					if(sv1.getDiemtb()<sv2.getDiemtb()){
						return 1;
					}else if(sv1.getDiemtb()>sv2.getDiemtb()){
						return -1;
					 } else {
						 return 0;
					 
						
					}
				
				}
			});
		
		
		
			}

		
		
	
public void add(int arg0, SinhVien arg1) {
	danhsach.add(arg0, arg1);
}
public boolean add(SinhVien arg0) {
	return danhsach.add(arg0);
}
public boolean addAll(Collection<? extends SinhVien> arg0) {
	return danhsach.addAll(arg0);
}
public boolean addAll(int arg0, Collection<? extends SinhVien> arg1) {
	return danhsach.addAll(arg0, arg1);
}
public void clear() {
	danhsach.clear();
}
public Object clone() {
	return danhsach.clone();
}
public boolean contains(Object arg0) {
	return danhsach.contains(arg0);
}
public boolean containsAll(Collection<?> arg0) {
	return danhsach.containsAll(arg0);
}
public void ensureCapacity(int arg0) {
	danhsach.ensureCapacity(arg0);
}
public boolean equals(Object arg0) {
	return danhsach.equals(arg0);
}
public void forEach(Consumer<? super SinhVien> arg0) {
	danhsach.forEach(arg0);
}
public SinhVien get(int arg0) {
	return danhsach.get(arg0);
}
public int hashCode() {
	return danhsach.hashCode();
}
public int indexOf(Object arg0) {
	return danhsach.indexOf(arg0);
}
public boolean isEmpty() {
	return danhsach.isEmpty();
}
public Iterator<SinhVien> iterator() {
	return danhsach.iterator();
}
public int lastIndexOf(Object arg0) {
	return danhsach.lastIndexOf(arg0);
}
public ListIterator<SinhVien> listIterator() {
	return danhsach.listIterator();
}
public ListIterator<SinhVien> listIterator(int arg0) {
	return danhsach.listIterator(arg0);
}
public Stream<SinhVien> parallelStream() {
	return danhsach.parallelStream();
}
public SinhVien remove(int arg0) {
	return danhsach.remove(arg0);
}
public boolean remove(Object arg0) {
	return danhsach.remove(arg0);
}
public boolean removeAll(Collection<?> arg0) {
	return danhsach.removeAll(arg0);
}
public boolean removeIf(Predicate<? super SinhVien> arg0) {
	return danhsach.removeIf(arg0);
}
public void replaceAll(UnaryOperator<SinhVien> arg0) {
	danhsach.replaceAll(arg0);
}
public boolean retainAll(Collection<?> arg0) {
	return danhsach.retainAll(arg0);
}
public SinhVien set(int arg0, SinhVien arg1) {
	return danhsach.set(arg0, arg1);
}
public int size() {
	return danhsach.size();
}
public void sort(Comparator<? super SinhVien> arg0) {
	danhsach.sort(arg0);
}
public Spliterator<SinhVien> spliterator() {
	return danhsach.spliterator();
}
public Stream<SinhVien> stream() {
	return danhsach.stream();
}
public List<SinhVien> subList(int arg0, int arg1) {
	return danhsach.subList(arg0, arg1);
}
public Object[] toArray() {
	return danhsach.toArray();
}
public <T> T[] toArray(T[] arg0) {
	return danhsach.toArray(arg0);
}
public String toString() {
	return danhsach.toString();
}
public void trimToSize() {
	danhsach.trimToSize();
}
}


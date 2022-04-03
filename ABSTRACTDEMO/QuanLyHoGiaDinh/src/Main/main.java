package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Srouce.Family;
import Srouce.Person;
import Srouce.Town;

public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Town town=new Town();
	System.out.println(" enter the number of the family you waunt manage");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println(" enter address of family");
		String address=sc.nextLine();
		sc.nextLine();
		List<Person> persons=new ArrayList<>();
		System.out.println(" enter the number of person in fammily ");
		int m=sc.nextInt();
		for(int j=0;j<m;j++){
			System.out.println(" enter name of peron ");
			String name =sc.nextLine();
			sc.nextLine();
			System.out.println(" enter age of person");
			int age=sc.nextInt();
			System.out.println(" entet jop of person");
			String jop=sc.nextLine();sc.nextLine();
			System.out.println(" enter id of person");
			long id=sc.nextLong();
			
		}
		town.add(new Family(persons, address));
	}
	for( int i=0;i<n;i++){
		town.showinfor();
	}
}
}

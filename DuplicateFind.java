package lecture;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateFind {

	
	public static void duplicate(List<Double> l1){
		Set<Double> set=new TreeSet<Double>();
		Set<Double> duplicateList=new TreeSet<Double>();
		for(Double d:l1)
		{
			if(!set.add(d))
			{
				duplicateList.add(d);
			}
		}
		
		System.out.println("Duplicate elements are: ");
		for(Double dup:duplicateList)
		{
			System.out.print(dup+" ");
		}
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> db = new ArrayList<Double>();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 10 floating pt nos: ");
		int i =0;
		while(i<10)
		{
			db.add(i,sc.nextDouble());
			i++;
		}
		sc.close();
		duplicate(db);

	}

}

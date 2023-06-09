package collectionProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Iterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Set set = new HashSet();
		
		for(int i = 1; i <= 5; i++) {
			list.add(i);
			set.add(i+5);
		}
		System.out.println(list);
		System.out.println(set);
		
		// Iterator 반복자 패턴
		
		// 1
		Iterator it = (Iterator) list.iterator();
		
		// 2
		System.out.println(it);
		
		while(it.hasnext()) {
			 int num = (Integer)it.next();
			 System.out.println(num);
		}
		
		Iterator it2 = set.iterator();
		
		while(it2.hasNext()) {
			int num = (Integer)it2.next();
			System.out.println(num);
		}
	}
	
	

}

package collectionProject;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 기본이 10
		list.add(1);  // list.add(new Integer(1));
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		list.add(0.2); // new double(0.2)
		
		int num = (Integer)list.get(0);
		System.out.println(num);
		
//		double dnum = (double)list.get(5);
//		System.out.println(dnum);
		
		System.out.println(list); // 오버라이딩
		
		
		System.out.println((Integer)(list.get(0))); // toString() 생략됨, 오버라이딩(자식꺼 가져옴)
		System.out.println(list.get(0)); 
		
		for(Object obj : list) {
			int i = (Integer)obj;
			System.out.println(i);
		}
	}

}

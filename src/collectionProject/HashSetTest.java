package collectionProject;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1);		// new Integer(1)
		set.add(4);
		set.add(2);
		set.add(5);
		set.add(3);		// new Integer(3)
		set.add(3);
		set.add(3);
		set.add("3");  // new String("3")
		set.add("홍길동");
		set.add("이순신");
		
		// 1. 중복 허용하지 않음
		// 2. 순서가 없다.
		
		System.out.println(set);
	}

}

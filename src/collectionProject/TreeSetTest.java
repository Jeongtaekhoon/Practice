package collectionProject;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

	private static final Comparator Descond = null;

	public static void main(String[] args) {
		// TreeSet set = new TreeSet();
		
		// 자동정렬이 아니다
		// 데이터 자체에 정렬기준이 정의되어 있다.
		// Integer 클래스는 Comparable이 상속되어 있다.
		// compareTo() 오버라이딩이 필요하다.
		
//		set.add(3);  // new Integer(3);
//		set.add(1);
//		set.add(4);
//		set.add(2);
//		set.add(5);
//		
//		System.out.println(set);
		
//		set.add("홍길동");
//		set.add("이길동");
//		set.add("고길동");
//		set.add("최길동");
//		set.add("다길동");
//		
//		System.out.println(set);
		
//		TreeSet set1 = new TreeSet();
//		set1.add(new Member("홍길동", 14));
//		set1.add(new Member("고길동", 12));
//		set1.add(new Member("이길동", 11));
//		
//		System.out.println(set1);
		
		TreeSet set = new TreeSet();
		
		set.add("홍길동");
		set.add("이길동");
		set.add("고길동");
		set.add("최길동");
		set.add("다길동");
		
		System.out.println("오름차순");
		System.out.println(set);
		
		TreeSet set2 = new TreeSet(Descond());
		set2.add("홍길동");
		set2.add("이길동");
		set2.add("고길동");
		set2.add("최길동");
		set2.add("다길동");
		
		System.out.println("내림차순");
		System.out.println(set2);
	}

}

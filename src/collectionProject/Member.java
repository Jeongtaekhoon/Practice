package collectionProject;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Member implements Comparable{
	
	String name;
	int age;
	
	@Override
	public int compareTo(Object o) {
		Member other = (Member)o
;		return this.name.compareTo(other.name); // "홍길동".compareTO("홍길동")
		
//		if(o instanceof Member) {
//			Member other = (Member)o;
//			return this.age - other.age; // 1, 0, -1
//		}
//		return -1;
		
		// this가 앞에 있으면 오름차순
		// 음수, 0, 양수
//		return other.age - this.age; // this가 뒤에 있으면 내림차순
	}
	
	// equals()
	// hashcode()
	
	

}
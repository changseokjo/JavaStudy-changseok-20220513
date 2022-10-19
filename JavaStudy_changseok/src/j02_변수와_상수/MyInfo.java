package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 조창석
		 * 나이 : 25
		 * 연락처: 010-3343-6218
		 * 주소: 부산 북구 화명동
		 * 
		 */

		char name1 = '조';
		char name2 = '창';
		char name3 = '석';
		int age = 25;
		String phone = "010-3343-6218";
		String address = "부산 북구 화명동";
		
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);

		System.out.println("나이: " + age);
		
		System.out.print("연락처: ");
		System.out.println(phone);
		
		System.out.print("주소: ");
		System.out.println(address);

		System.out.println("이름: " + name1 + name2 + name3);
		
		System.out.println("세수의 합: " + (10 + 20 + 30));
	}

}

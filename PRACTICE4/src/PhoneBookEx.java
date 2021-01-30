// 4장 실습 8번
import java.util.*;

class Phone {
	private String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

class PhoneBook {
	Scanner scanner = new Scanner(System.in);
	Phone phone[];
	int num;

	public void getNum() {
		System.out.print("인원수 >> ");
		num = scanner.nextInt();
		phone = new Phone[num];
	}

	public void getImfo() {
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.....");
	}

	public void Search() {
		boolean state=false;
		
		while (true) {
			System.out.print("검색할 이름 >> ");
			String name = scanner.next();

			if (name.equals("그만"))
				break;

			for (int i = 0; i < phone.length; i++) {
				if (phone[i].getName().equals(name)) {
					System.out.println(name + "의 번호는 " + phone[i].getTel() + "입니다.");
					state=true;
				}
			}
			
			if(state==false)
				System.out.println(name + "이 없습니다.");
		}
	}
}

public class PhoneBookEx {
	public static void main(String[] args) {
		PhoneBook phone=new PhoneBook();
		phone.getNum();
		phone.getImfo();
		phone.Search();
	}
}
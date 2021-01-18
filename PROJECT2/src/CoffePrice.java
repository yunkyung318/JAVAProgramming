// 2-15
import java.util.Scanner;

public class CoffePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("무슨 커피 드릴까요? ");
		String coffee = scanner.next();

		switch (coffee) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			System.out.println(coffee + "는 3500원입니다.");
			break;
		case "아메리카노":
			System.out.println(coffee + "는 2000원입니다.");
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		scanner.close();
	}

}

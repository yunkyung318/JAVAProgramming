// 2-15
import java.util.Scanner;

public class CoffePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� Ŀ�� �帱���? ");
		String coffee = scanner.next();

		switch (coffee) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			System.out.println(coffee + "�� 3500���Դϴ�.");
			break;
		case "�Ƹ޸�ī��":
			System.out.println(coffee + "�� 2000���Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
		}
		scanner.close();
	}

}

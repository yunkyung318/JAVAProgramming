//2-5
import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int time = scanner.nextInt();
		int hour = (time / 60) / 60;
		int min = (time / 60) % 60;
		int sec = (time % 60);

		System.out.println(time + "�ʴ� " + hour + "�ð� " + min + "�� " + sec + "�� �Դϴ�");

		scanner.close();
	}
}

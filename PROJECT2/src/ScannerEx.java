//2-4
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner=new Scanner(System.in);
		
		String name=scanner.next();
		System.out.print("�̸��� "+name+",");
		// System.out.print("�̸��� "+scanner.next()); �̰͵� ��!
		String city=scanner.next();
		System.out.print("���ô� "+city+",");
		
		int age=scanner.nextInt();
		System.out.print("���̴� "+age+",");
		
		double weight=scanner.nextDouble();
		System.out.print("ü���� "+weight+",");
		
		boolean single=scanner.nextBoolean();
		System.out.print("���� ���δ� "+single+"�Դϴ�.");
		
		scanner.close();
	}
}

//2-10
import java.util.Scanner;
public class SuccesOrFail {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score=scanner.nextInt();
		
		if(score>80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		else
			System.out.println("Ż��!");
		
		scanner.close();
	}

}

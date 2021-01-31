// 4장 실습 10번
import java.util.*;
class Add{
	private int a,b;
	
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a+b;
	}
}

class Sub{
	private int a,b;
	
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a-b;
	}
}

class Mul{
	private int a,b;
	
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a*b;
	}
}

class Div{
	private int a,b;
	
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a/b;
	}
}
public class CalculateEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		String cal=scanner.next();
		
		switch(cal) {
		case "+":
			Add add=new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub=new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul=new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div=new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			default:
				System.out.println("해당 연산자는 없습니다.");
				return;
		}
	}

}

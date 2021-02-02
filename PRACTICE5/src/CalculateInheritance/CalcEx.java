package CalculateInheritance;
import java.util.*;
// 5장 실습 11번
class Add extends Calc {
	public int Calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	public int Calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	public int Calculate() {
		return a * b;
	}
}

class Div extends Calc {
	public int Calculate() {
		if (b == 0)
			return -1;
		return a / b;
	}
}

public class CalcEx {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int result=0;
	      System.out.print("두 정수와 연산자를 입력하시오 >> ");
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      String s = sc.next();
	      
	      Calc cal;
	      switch(s) {
	      case "+" : 
	         cal = new Add();
	         break;
	      case "-" :
	         cal = new Sub();
	         break;
	      case "*" :
	         cal = new Mul();
	         break;
	      case "/" :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("잘못된 연산자 입니다.");
	         sc.close();
	         return;
	      }
	      cal.setValue(a, b);
	      result = cal.Calculate();
	      System.out.println(result);
	      sc.close();
	}

}

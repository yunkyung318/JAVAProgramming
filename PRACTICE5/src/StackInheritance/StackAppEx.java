package StackInheritance;
// 5장 실습 9번
import java.util.*;

class StackApp implements Stack {
	private String[] stack;
	private int top;

	public StackApp(int num) {
		stack = new String[num];
		top = 0;
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return stack.length;
	}

	@Override
	public String pop() {
		if (top == 0)
			return "비어있음";
		else {
			String re = stack[top-1];
			top--;
			return re;
		}
	}

	@Override
	public boolean push(String val) {
		if (top == stack.length)
			return false;
		else {
			stack[top] = val;
			top++;
			return true;
		}

	}
}

public class StackAppEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = sc.nextInt();
		
		StackApp stack=new StackApp(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String ment=sc.next();
			
			if(ment.equals("그만"))
				break;
			
			boolean result=stack.push(ment);
			if(result==false)
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len=stack.length();
		for(int i=0;i<len;i++)
			System.out.print(stack.pop()+" ");
	}

}

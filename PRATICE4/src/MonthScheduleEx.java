// 4장 실습 7번
import java.util.*;

class Day{
	private String work;
	
	public void set(String work) {
		this.work=work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work==null)
			System.out.println("없습니다.");
		else
			System.out.println(work+"입니다.");
	}
}

class MonthScheduling{
	Scanner scanner=new Scanner(System.in);
	
	private int count;
	private Day day[];
	
	public MonthScheduling(int count) {
		this.count=count;
		day=new Day[this.count];
		for(int i=0;i<day.length;i++)
			day[i]=new Day();
	}
	
	public void input() {
		System.out.print("날짜(1~"+count+")? ");
		int choice=scanner.nextInt();
		
		System.out.print("할일(빈칸없이 입력)? ");
		String work=scanner.next();
		
		day[choice-1].set(work);
	}
	
	public void view() {
		System.out.print("날짜(1~"+count+")? ");
		int choice=scanner.nextInt();
		day[choice-1].show();
	}
	
	public void finish() {
		System.exit(0);
	}
	
	public void run() {
		int num;
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			num = scanner.nextInt();
			
			switch(num) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
	}
}

public class MonthScheduleEx {
	public static void main(String[] args) {
		MonthScheduling april=new MonthScheduling(30);
		april.run();
	}
}

// 4장 실습 1번

class TV{
	private String name;
	private int year;
	private int inch;
	
	public TV(String name,int year,int inch) {
		this.name=name;
		this.year=year;
		this.inch=inch;
	}
	
	public void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}

public class TVEx {
	public static void main(String[] args) {
		TV myTv=new TV("LG",2017,32);
		myTv.show();
	}

}

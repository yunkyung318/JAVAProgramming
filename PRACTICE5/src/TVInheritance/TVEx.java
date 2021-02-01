package TVInheritance;
// 5장 실습 1번

class ColorTv extends Tv{
	private int color;
	public ColorTv(int size,int color) {
		super(size);
		this.color=color;
	}
	protected int getColor() {
		return color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
}

public class TVEx {
	public static void main(String[] args) {
		ColorTv myTv=new ColorTv(32,1024);
		myTv.printProperty();
	}

}

package ShapeInheritance3;

class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}
	
}

class Oval implements Shape{
	private int height,width;
	
	public Oval(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	@Override
	public void draw() {
		System.out.println(height+"x"+width+"에 내접하는 타원입니다.");	
	}

	@Override
	public double getArea() {
		return height*width*PI;
	}
	
}

class Rect implements Shape{
	private int height,width;
	
	public Rect(int height,int width) {
		this.height=height;
		this.width=width;
	}
	@Override
	public void draw() {
		System.out.println(height+"x"+width+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		return height*width;
	}
	
}

public class CircleEx {

	public static void main(String[] args) {
		Shape list[]=new Shape[3];
		list[0]=new Circle(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect(10,40);
		
		for(int i=0;i<list.length;i++)
			list[i].redraw();
		for(int i=0;i<list.length;i++)
			System.out.println("면적은 "+list[i].getArea());
	}

}

package PointInheritance;
// 5장 실습 5,6,7,8 상속 클래스
public class Point {
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(0,0);
		this.color="BLACK";
	}
	
	public ColorPoint(int x,int y) {
		super(x,y);
	}
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	
	public void setXY(int x,int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+") 의 점";
	}
}
package PointInheritance;
// 5장 실습 7번
class Point3D extends Point{
	private int z;
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	
	public void move(int x,int y) {
		super.move(x,y);
	}
	
	public void move(int x,int y,int z) {
		super.move(x,y);
		this.z=z;
	}
	
	public void moveUp() {
		this.z+=1;
	}
	
	public void moveDown() {
		this.z-=1;
	}
	
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
}

public class Point3DEx {

	public static void main(String[] args) {
		Point3D p=new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");
	}

}

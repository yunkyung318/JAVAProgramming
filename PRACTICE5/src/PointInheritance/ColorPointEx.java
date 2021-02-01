package PointInheritance;
// 5장 실습 5번

public class ColorPointEx {

	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5,5,"Yellow");
		cp.setXY(10,20);
		cp.setColor("Red");
		String str=cp.toString();
		System.out.println(str+"입니다.");
	}

}

package PointInheritance;
// 5장 실습 6번

public class ColorPointEx2 {
	public static void main(String[] args) {
		ColorPoint zeroPoint=new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cp=new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}

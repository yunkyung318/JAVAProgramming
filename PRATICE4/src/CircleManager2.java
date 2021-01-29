
// 4장 실습 5번
import java.util.*;

class Circle2 {
	private double x, y;
	private int radius;

	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int getRadius() {
		return radius;
	}
}

public class CircleManager2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Circle2 c[] = new Circle2[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle2(x, y, radius);
		}

		int max = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[max].getRadius() < c[i].getRadius())
				max = i;
		}

		c[max].show();
		scanner.close();
	}

}

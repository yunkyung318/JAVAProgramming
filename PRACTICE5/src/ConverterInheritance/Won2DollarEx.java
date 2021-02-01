package ConverterInheritance;
// 5장 실습 3번
class Won2Dollar extends Converter{
	public Won2Dollar(int ratio) {
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
}

public class Won2DollarEx {

	public static void main(String[] args) {
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
	}

}

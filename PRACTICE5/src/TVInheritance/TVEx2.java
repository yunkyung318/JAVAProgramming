package TVInheritance;
// 5장 실습 2번

class IPTV extends ColorTv{
	private String ip;
	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip=ip;
	}
	protected String getIp() {
		return ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+getIp()+"주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}

public class TVEx2 {
	public static void main(String[] args) {
		IPTV ipTv=new IPTV("192.1.1.2",32,2048);
		ipTv.printProperty();
	}

}

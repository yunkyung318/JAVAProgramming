// 4장 실습 3번

class Song{
	private String title,artist,country;
	private int year;
	
	public Song() {
		this.title="";
		this.artist="";
		this.year=0;
		this.country="";
	}
	
	public Song(String title, String artist,int year,String country) {
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
}

public class SongEx {

	public static void main(String[] args) {
		Song song=new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
	}

}

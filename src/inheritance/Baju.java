package inheritance;

public class Baju {
	String warna;
	int ukuran;
	
	public Baju() {
		super();
	}
	public Baju(String warna, int ukuran) {
		super();
		this.warna = warna;
		this.ukuran = ukuran;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}	
	
	public int getUkuran() {
		return ukuran;
	}
	public void setUkuran(int ukuran) {
		this.ukuran = ukuran;
	}
	
}

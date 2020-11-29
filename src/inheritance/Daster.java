package inheritance;

public class Daster extends Baju {
	
	public Daster() {
		super("kuning", 37);
	}
	
	public void tampil() {
		System.out.println("Baju warna "+warna+", ukurang "+ukuran);
	}
	
	public void setWarna(String warna, String pola) {
		this.warna = warna;
	}
	
	@Override
	public void setWarna(String warna) {
		warna = warna.concat(" muda");
		System.out.println("warna "+warna);
	}
	
	public static void main(String[] args) {
		Daster d = new Daster();
		d.tampil();
	}
}

package sk.upjs.ics.kopr2016.cviko01.priklad4;

public class Pocitadlo {

	private int hodnota;
	
	public int getNext() {
		synchronized (this) {
			return ++hodnota;
		}
	}
}

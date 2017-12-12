package main;

import java.util.Random;

public class Hart
{
	private int hartslag = 0;
	private int aantalDefibrilleerPogingen;
	
	public int getHartslag() {
		return this.hartslag;
	}
	
	public int getAantalDefibrilleerProgingen() {
		return this.aantalDefibrilleerPogingen;
	}
	public void defibrilleer() {
		this.aantalDefibrilleerPogingen++;
		Random rand = new Random();
		int  hartslag = rand.nextInt(100);
		if (hartslag > 55 && hartslag < 80) {
			this.hartslag = hartslag;
		}
	}

	
	public boolean heeftHartslag() {
		return ( this.getHartslag() > 54 && this.getHartslag() <= 100 );
	}
}
